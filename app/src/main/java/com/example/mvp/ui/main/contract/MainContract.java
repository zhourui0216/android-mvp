package com.example.mvp.ui.main.contract;

import com.example.mvp.base.IModel;
import com.example.mvp.base.IPresenter;
import com.example.mvp.base.IView;
import com.example.mvp.bean.Data;

import rx.Observable;

public interface MainContract {
    interface view extends IView {
        void getSuccess(String str);

        void getFile(Throwable e);
    }

    interface presenter {
        void getData();
    }

    interface model extends IModel {
        Observable<Data> getData(int id);
    }
}
