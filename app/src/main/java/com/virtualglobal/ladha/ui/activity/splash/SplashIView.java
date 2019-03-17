package com.virtualglobal.ladha.ui.activity.splash;

import com.virtualglobal.ladha.base.MvpView;
import com.virtualglobal.ladha.data.network.models.User;


public interface SplashIView extends MvpView {
    void onSuccess(User user);
    void onError(Throwable e);
}
