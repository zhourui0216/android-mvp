package com.example.mvp.api;

import com.example.mvp.bean.Data;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface ApiService {
    @GET("/posts/{id}")
    Observable<Data> getData(@Path("id") int id);
}
