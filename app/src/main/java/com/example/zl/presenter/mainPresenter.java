package com.example.zl.presenter;

import android.util.Log;

import com.example.zl.adapter.HomeAdapter;
import com.example.zl.bean.JsonBean;
import com.example.zl.modle.Imodle;
import com.example.zl.modle.mainModle;
import com.example.zl.url.ALlURL;
import com.example.zl.view.Iview;

import java.util.ArrayList;

/**
 * Created by zl on 2017/4/26.
 */

public class mainPresenter extends BasePresenter<Iview> {
    private Iview mainView;
    private Imodle mainModle;
    public mainPresenter(Iview mainView) {
        this.mainView = mainView;
        mainModle = new mainModle();
    }

    public void downLoadData(final HomeAdapter homeAdapter) {
        mainView.showButtonDownloading();
        mainModle.downLoadData(ALlURL.newsURL,new Imodle.onDownLoadDataListener() {
            @Override
            public void onDownLoadSucceed(String json) {
                Log.d("sout","json获取成功");
                mainModle.parseJson(json, new Imodle.onParseJsonListener() {
                    @Override
                    public void onParseJsonSucceed(ArrayList<JsonBean.ResultBean.DataBean> arrayList) {
                        Log.d("sout","json解析成功");
                        mainView.showButtonDownloaded();
                        homeAdapter.setArrayList(arrayList);
                        homeAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onParseJsonError() {
                        Log.e("sout","解析json数据失败");
                    }
                });
            }

            @Override
            public void onDownLoadError() {
                Log.e("sout","获取json数据失败");
                mainView.showButtonDownloadError();
            }
        });
    }
}
