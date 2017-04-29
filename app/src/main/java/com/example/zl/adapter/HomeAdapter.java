package com.example.zl.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.zl.bean.JsonBean;
import com.example.zl.mvp_okhttp_rx_picasso.R;
import com.example.zl.picasso.PicassoUtils;
import java.util.ArrayList;

/**
 * Created by zl on 2017/4/26.
 */
//支持Resources, assets, files, content providers作为图片源
//Picasso.with(context).load(R.drawable.landing_screen).into(imageView1);
//Picasso.with(context).load("file:///android_asset/DvpvklR.png").into(imageView2);
//Picasso.with(context).load(new File(...)).into(imageView3);
//

//            requestCreator.tag(tag);设置key
//
//            requestCreator.error(); 设置加载失败图片
//
//            mPicasso.pauseTag(); 暂停加载
//
//            mPicasso.resumeTag();恢复加载
//
//            mPicasso.cancelRequest();取消加载
//
//            requestCreator.priority()优先级
//
//            requestCreator..rotate() 旋转之类
//
//    取消加载
//
//            .cancelRequest(ImageView imageView)
//            .cancelTag(Object obj)
//            .cancelRequest(Target)

//    在加载图片时直接不让做缓存！
//     Picasso.with(getContext()).load(Url).memoryPolicy(MemoryPolicy.NO_CACHE).into(image);


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {
    private Context mContext;
    private ArrayList<JsonBean.ResultBean.DataBean> arrayList;
    public HomeAdapter(Context context) {
        mContext = context;
    }


    @Override
    public HomeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View.inflate(mContext, R.layout.list_item,null);
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null);
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(final HomeHolder homeHolder , int position) {
        JsonBean.ResultBean.DataBean dataBean = arrayList.get(position);
        String title = dataBean.getTitle();
        final String pic_s_url = dataBean.getThumbnail_pic_s();
        homeHolder.item_text.setText(title);
        PicassoUtils.loadImageWithHolder(mContext,pic_s_url,R.mipmap.ic_launcher_round,homeHolder.item_image);
    }

    @Override
    public int getItemCount() {
        if (arrayList == null){
            Log.d("sout","arraylist = null");
            return 0;
        }
        return arrayList.size();
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public class HomeHolder extends RecyclerView.ViewHolder {
        private ImageView item_image;
        private TextView item_text;
        public HomeHolder(View view) {
            super(view);
            item_image = (ImageView) view.findViewById(R.id.item_image);
            item_text = (TextView) view.findViewById(R.id.item_text);
        }
    }
}


