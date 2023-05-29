package com.example.mvp.ui.main.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.mvp.R;
import com.example.mvp.base.BaseActivity;
import com.example.mvp.ui.main.contract.MainContract;
import com.example.mvp.ui.main.presenter.MainPresenter;
import com.example.mvp.utils.LogUtil;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.view, View.OnClickListener {
    @BindView(R.id.button1)
    Button button1;
    @BindView(R.id.content1)
    TextView content1;
    @BindView(R.id.loading)
    ProgressBar loading;

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        button1.setOnClickListener(this);
        mPresenter.getData();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                LogUtil.d("点击了按钮");
                mPresenter.getData();
                break;
        }
    }

    @Override
    public void getSuccess(String str) {
        content1.setText(str);
    }

    @Override
    public void getFile(Throwable e) {

    }

    @Override
    public void dismissLoading() {
        loading.setVisibility(View.GONE);
    }

    @Override
    public void showLoading() {
        loading.setVisibility(View.VISIBLE);
    }
}