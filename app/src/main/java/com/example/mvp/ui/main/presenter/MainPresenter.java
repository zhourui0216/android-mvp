package com.example.mvp.ui.main.presenter;

import com.example.mvp.base.BasePresenter;
import com.example.mvp.base.IModel;
import com.example.mvp.base.IPresenter;
import com.example.mvp.ui.main.contract.MainContract;

public class MainPresenter extends BasePresenter<MainContract.view, MainContract.model> implements MainContract.presenter {

    @Override
    protected MainContract.model createModule() {
        return null;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void onNetError() {

    }
}
