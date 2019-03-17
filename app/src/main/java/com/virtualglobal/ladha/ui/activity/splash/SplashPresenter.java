package com.virtualglobal.ladha.ui.activity.splash;

import com.virtualglobal.ladha.base.BasePresenter;
import com.virtualglobal.ladha.data.network.APIClient;
import com.virtualglobal.ladha.data.network.models.User;


import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SplashPresenter<V extends SplashIView> extends BasePresenter<V> implements SplashIPresenter<V> {
    @Override
    public void profile() {
        Observable modelObservable = APIClient.getAPIClient().profile();
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((User) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
