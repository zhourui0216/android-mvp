package com.example.mvp.base;

import com.example.mvp.api.ApiService;
import com.example.mvp.api.RetrofitClient;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BaseModel implements IModel {
    protected ApiService mApiService;

    public BaseModel() {
        mApiService = RetrofitClient.getInstance().getService(ApiService.class);
    }
}
