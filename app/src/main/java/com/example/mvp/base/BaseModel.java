package com.example.mvp.base;

import com.example.mvp.api.ApiService;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BaseModel implements IModel {
    protected ApiService mApiService;
    private CompositeSubscription mCompositeSubscription;

    public BaseModel() {

    }

    @Override
    public void addSubscribe(Subscription subscription) {

    }

    @Override
    public void unSubscribe() {

    }
}
