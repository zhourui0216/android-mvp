package com.example.mvp.base;

import rx.Subscription;

public interface IModel {
    /**
     * 绑定rxjava
     *
     * @param subscription
     */
    void addSubscribe(Subscription subscription);

    /**
     * 解绑rxjava
     */
    void unSubscribe();
}
