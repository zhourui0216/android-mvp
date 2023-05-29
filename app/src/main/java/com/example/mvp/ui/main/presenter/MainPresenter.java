package com.example.mvp.ui.main.presenter;

import android.util.Log;

import com.example.mvp.base.BasePresenter;
import com.example.mvp.base.IModel;
import com.example.mvp.base.IPresenter;
import com.example.mvp.bean.Data;
import com.example.mvp.ui.main.contract.MainContract;
import com.example.mvp.ui.main.model.MainModel;
import com.example.mvp.utils.LogUtil;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainPresenter extends BasePresenter<MainContract.view, MainContract.model> implements MainContract.presenter {

    @Override
    protected MainContract.model createModule() {
        return new MainModel();
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

    @Override
    public void getData() {
        getView().showLoading();
        LogUtil.d("获取数据");

        mModel.getData((int) (Math.random() * 100)).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Data>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtil.d(e.toString());
                        getView().getFile(e);
                        getView().dismissLoading();
                    }

                    @Override
                    public void onNext(Data data) {
                        getView().getSuccess(data.toString());
                        getView().dismissLoading();
                    }
                });
    }
}
