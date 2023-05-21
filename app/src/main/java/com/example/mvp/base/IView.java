package com.example.mvp.base;

public interface IView {
    /**
     * 显示加载框
     */
    void showLoading();

    /**
     * 显示加载框
     */
    void dismissLoading();

    /**
     * 网络错误
     */
    void onNetError();
}
