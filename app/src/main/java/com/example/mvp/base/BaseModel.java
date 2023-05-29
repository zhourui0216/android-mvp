package com.example.mvp.base;

import com.example.mvp.api.ApiService;
import com.example.mvp.api.RetrofitClient;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BaseModel implements IModel {
    protected ApiService mApiService;
    private CompositeSubscription mCompositeSubscription;

    public BaseModel() {
        mApiService = RetrofitClient.getInstance().getService(ApiService.class);
    }

    @Override
    public void addSubscribe(Subscription subscription) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscription);
    }

    @Override
    public void unSubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.isUnsubscribed()) {
            mCompositeSubscription.clear();
            mCompositeSubscription.unsubscribe();
        }
    }
}
