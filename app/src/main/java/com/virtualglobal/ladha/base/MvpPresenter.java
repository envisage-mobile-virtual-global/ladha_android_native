package com.virtualglobal.ladha.base;

import android.app.Activity;

import com.virtualglobal.ladha.MvpApplication;

public interface MvpPresenter<V extends MvpView> {
    Activity activity();
    MvpApplication appContext();
    void attachView(V mvpView);

    void detachView();
}
