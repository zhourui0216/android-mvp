package com.example.mvp.ui.main.activity;

import com.example.mvp.R;
import com.example.mvp.base.BaseActivity;
import com.example.mvp.ui.main.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> {

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

    }
}