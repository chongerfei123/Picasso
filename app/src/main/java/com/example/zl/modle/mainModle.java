package com.example.zl.modle;

import android.support.annotation.NonNull;
import com.example.zl.bean.JsonBean;
import com.example.zl.http.OkhttpRxAndroid;
import com.google.gson.Gson;
import java.util.ArrayList;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by zl on 2017/4/26.
 */

public class mainModle implements Imodle {

    @Override
    public void downLoadData(String url,final onDownLoadDataListener listener) {
        OkhttpRxAndroid okhttpRxAndroid = OkhttpRxAndroid.getInstance();
        Observable observable = okhttpRxAndroid.downLoadData(url);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                listener.onDownLoadError();
            }

            @Override
            public void onNext(String s) {
                listener.onDownLoadSucceed(s);
            }
        });
    }

    @Override
    public void parseJson(final String json, final onParseJsonListener listener) {
        Observable<ArrayList<JsonBean.ResultBean.DataBean>> observable = GsonRxAndroid(json);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<ArrayList<JsonBean.ResultBean.DataBean>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                listener.onParseJsonError();
            }

            @Override
            public void onNext(ArrayList<JsonBean.ResultBean.DataBean> dataBeen) {
                listener.onParseJsonSucceed(dataBeen);
            }
        });
    }

    @NonNull
    private Observable<ArrayList<JsonBean.ResultBean.DataBean>> GsonRxAndroid(final String json) {
        return Observable.create(new Observable.OnSubscribe<ArrayList<JsonBean.ResultBean.DataBean>>() {
                @Override
                public void call(Subscriber<? super ArrayList<JsonBean.ResultBean.DataBean>> subscriber) {
                    try{
                        Gson gson = new Gson();
                        JsonBean jsonBean = gson.fromJson(json, JsonBean.class);
                        ArrayList<JsonBean.ResultBean.DataBean> dataBeen = (ArrayList<JsonBean.ResultBean.DataBean>) jsonBean.getResult().getData();
                        subscriber.onNext(dataBeen);
                        subscriber.onCompleted();
                    }catch (Exception e){
                        subscriber.onError(e);
                    }
                }
            });
    }
}
