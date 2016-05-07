package com.example.caizenghui.gradleuse;

import android.app.Application;
import android.util.Log;
import android.util.Printer;

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

        getMainLooper().setMessageLogging(new Printer() {
            @Override
            public void println(String x) {
                Log.d("MainLooper","******************"+x+"**********************");
            }
        });
    }
}
