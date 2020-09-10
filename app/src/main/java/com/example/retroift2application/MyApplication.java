package com.example.retroift2application;

import android.app.Application;

import com.example.retroift2application.di.AppComponent;
import com.example.retroift2application.di.AppModule;
import com.example.retroift2application.di.DaggerAppComponent;

public class MyApplication  extends Application {

    private static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
    }

    public static AppComponent getAppComponent() {
        return mAppComponent;
    }
}
