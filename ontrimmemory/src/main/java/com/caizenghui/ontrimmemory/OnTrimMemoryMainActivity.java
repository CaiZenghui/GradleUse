package com.caizenghui.ontrimmemory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
        switch (level){
            // onTrimMemory()方法中的TRIM_MEMORY_UI_HIDDEN回调只有当我们程序中的所有UI组件全部不可见的时候才会触发
            // 按 home 键时会调用，按电源键不会调用;
            case TRIM_MEMORY_UI_HIDDEN:
                Log.d("onTrimMemory","----------- TRIM_MEMORY_UI_HIDDEN ----------------");
                break;
        }
    }
}
