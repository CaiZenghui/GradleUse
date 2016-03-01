package com.example.caizenghui.gradleuse;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import utils.IntentUtils;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(BuildConfig.FLAVOR);

        tv.postDelayed(new Runnable() {
            @Override
            public void run() {
                IntentUtils.startActivity(SplashActivity.this, "gradle://main");
                finish();
            }
        }, 1000);
    }

}
