package com.example.mvp.base;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<T extends IView, K extends IModel> implements IPresenter<T> {
    protected K mModel;
    private WeakReference<T> weakReference;

    @Override
    public void attachView(T view) {
        weakReference = new WeakReference<>(view);
        if (mModel == null) {
            mModel = createModule();
        }
    }

    @Override
    public void detachView() {
        if (isBinding()) {
            weakReference.clear();
            weakReference = null;
        }
        if (mModel != null) {
            mModel = null;
        }
    }

    @Override
    public boolean isBinding() {
        return weakReference != null && weakReference.get() != null;
    }

    protected T getView() {
        return weakReference.get();
    }

    protected void showLoading() {
        if (weakReference != null) {
            getView().showLoading();
        }
    }

    protected void dismissLoading() {
        if (weakReference != null) {
            getView().hideLoading();
        }
    }

    protected void onNetError() {
        if (weakReference != null) {
            getView().onNetError();
        }
    }

    /**
     * 外部创建
     *
     * @return
     */
    protected abstract K createModule();
}
