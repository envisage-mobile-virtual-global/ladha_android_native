package com.virtualglobal.ladha.base;

import android.app.Activity;

public interface MvpView {
    Activity activity();
    void showLoading();
    void hideLoading();

    void showToast(String message);

}
