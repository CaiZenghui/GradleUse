package com.example.caizenghui.gradleuse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(BuildConfig.FLAVOR);
    }

}
