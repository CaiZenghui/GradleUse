package com.caizenghui.ontrimmemory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OnTrimMemoryMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_trim_memory_main);
    }

    // sdk 14 后出现；
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
