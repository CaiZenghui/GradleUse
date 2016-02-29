package com.example.caizenghui.gradleuse;

import android.app.Application;

/**
 * Created by YeLuo-PC on 2015/8/9.
 */
public class MyApplication extends Application {

    private static MyApplication instance;

    public static MyApplication getApplication() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
