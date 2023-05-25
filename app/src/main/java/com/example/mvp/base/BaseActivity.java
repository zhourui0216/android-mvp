package com.example.mvp.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp.R;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IView {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_Mvp);
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        initView();
        initPresenter();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    public void initPresenter() {
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    public void showLoading() {
        Log.d("BaseMvpActivity", "showLoading: ");
    }

    @Override
    public void dismissLoading() {
        Log.d("BaseMvpActivity", "dismissLoading: ");
    }

    @Override
    public void onNetError() {
        Log.d("BaseMvpActivity", "onNetError: ");
    }

    /**
     * 创建presenter
     *
     * @return
     */
    protected abstract P createPresenter();

    /**
     * 获取当前activity的id
     *
     * @return 当前xml的布局res ID
     */
    protected abstract int getLayoutId();

    /**
     * 初始化view控件
     */
    protected abstract void initView();

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

    /**
     * 切换页面
     *
     * @param context Context
     * @param cl      Class
     */
    public void switchPages(Context context, Class cl) {
        Intent intent = new Intent(context, cl);
        startActivity(intent);
        overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
    }
}
