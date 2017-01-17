package com.tmtron.timberlinttest;

import android.app.Application;

import timber.log.Timber;

public class TimberLintApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
