package com.example.mvp.ui.main.model;

import com.example.mvp.api.ApiService;
import com.example.mvp.api.RetrofitClient;
import com.example.mvp.base.BaseModel;
import com.example.mvp.bean.Data;
import com.example.mvp.ui.main.contract.MainContract;

import rx.Observable;
import rx.Subscription;

public class MainModel extends BaseModel implements MainContract.model {
    public Observable<Data> getData(int id) {
        return RetrofitClient.getInstance().getService(ApiService.class).getData(id);
    }
}
