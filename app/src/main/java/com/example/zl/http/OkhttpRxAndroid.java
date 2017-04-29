package com.example.zl.http;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by zl on 2017/4/26.
 */

public class OkhttpRxAndroid {
    private static OkhttpRxAndroid okhttpRxAndroid = null;
    private static OkHttpClient okHttpClient;

    public OkhttpRxAndroid() {
        okHttpClient = new OkHttpClient();
    }

    public static OkhttpRxAndroid getInstance(){
        if (okhttpRxAndroid == null){
            synchronized (OkhttpRxAndroid.class){
                okhttpRxAndroid = new OkhttpRxAndroid();
            }
        }
        return okhttpRxAndroid;
    }

    public Observable downLoadData(final String URL){

        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(final Subscriber<? super String> subscriber) {
                Request request = new Request.Builder().url(URL).build();
                okHttpClient.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        subscriber.onError(e);
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        subscriber.onNext(response.body().string());
                        subscriber.onCompleted();
                    }
                });
            }
        });
        return observable;
    }

}
