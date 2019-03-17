package com.virtualglobal.ladha;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.facebook.stetho.Stetho;
import com.virtualglobal.ladha.common.LocaleHelper;
import com.virtualglobal.ladha.common.SharedHelper;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class MvpApplication extends Application {
    private static MvpApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        mInstance = this;
        MultiDex.install(this);
    }

    public static synchronized MvpApplication getInstance() {
        return mInstance;
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase, "en"));
        MultiDex.install(newBase);
    }

    public NumberFormat getNumberFormat() {
        String currencyCode = SharedHelper.getKey(getApplicationContext(), "currency_code", "KES");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
        numberFormat.setCurrency(Currency.getInstance(currencyCode));
        numberFormat.setMinimumFractionDigits(2);
        return numberFormat;
    }
}
