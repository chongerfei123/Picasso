package com.example.zl.modle;

import com.example.zl.adapter.HomeAdapter;
import com.example.zl.bean.JsonBean;

import java.util.ArrayList;

/**
 * Created by zl on 2017/4/26.
 */

public interface Imodle {

    void downLoadData(String url,onDownLoadDataListener listener);
    interface onDownLoadDataListener{
        void onDownLoadSucceed(String json);
        void onDownLoadError();
    }

    void parseJson(String json, onParseJsonListener listener);
    interface onParseJsonListener{
        void onParseJsonSucceed(ArrayList<JsonBean.ResultBean.DataBean> arrayList);
        void onParseJsonError();
    }
}
