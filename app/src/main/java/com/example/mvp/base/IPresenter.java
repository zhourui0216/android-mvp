package com.example.mvp.base;

public interface IPresenter<T extends IView> {
    /**
     * 绑定view
     *
     * @param view
     */
    void attachView(T view);

    /**
     * 解绑view
     */
    void detachView();

    /**
     * 判断是否绑定
     *
     * @return true 已绑定
     */
    boolean isBinding();
}
