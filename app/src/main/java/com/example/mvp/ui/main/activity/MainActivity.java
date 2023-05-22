package com.example.mvp.ui.main.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.mvp.R;
import com.example.mvp.base.BaseActivity;
import com.example.mvp.base.BasePresenter;
import com.example.mvp.ui.main.fragment.HomeFragment;
import com.example.mvp.ui.main.fragment.MyFragment;
import com.example.mvp.ui.main.presenter.MainPresenter;
import com.example.mvp.utils.LogUtil;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends BaseActivity<MainPresenter> {

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }
}