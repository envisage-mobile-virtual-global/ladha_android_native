package com.virtualglobal.ladha.ui.activity.splash;

import com.virtualglobal.ladha.base.MvpPresenter;

public interface SplashIPresenter<V extends SplashIView> extends MvpPresenter<V> {
    void profile();
}
