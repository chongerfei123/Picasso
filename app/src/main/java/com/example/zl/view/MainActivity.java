package com.example.zl.view;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import com.example.zl.adapter.HomeAdapter;
import com.example.zl.mvp_okhttp_rx_picasso.R;
import com.example.zl.presenter.mainPresenter;

public class MainActivity extends BaseActivity<Iview,mainPresenter> implements Iview {
    private Button button;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private Context context;
    private HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        configreCyclerView();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.downLoadData(homeAdapter);
            }
        });

    }

    private void configreCyclerView() {
        homeAdapter = new HomeAdapter(context);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(homeAdapter);
    }

    private void initView() {
        context = getApplicationContext();
        button = (Button) findViewById(R.id.button);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    @Override
    protected mainPresenter createPresenter() {
        return new mainPresenter(this);
    }


    public void showButtonDownloading() {
        button.setText("正在加载...");
    }


    public void showButtonDownloaded() {
        button.setText("加载完成");
    }

    @Override
    public void showButtonDownloadError() {
        button.setText("加载错误");
    }
}
