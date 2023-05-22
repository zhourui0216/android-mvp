package com.example.mvp.ui.main.contract;

import com.example.mvp.base.IModel;
import com.example.mvp.base.IPresenter;
import com.example.mvp.base.IView;

public interface MainContract {
    interface view extends IView {
    }

    interface presenter extends IView {

    }

    interface model extends IModel {
    }
}
