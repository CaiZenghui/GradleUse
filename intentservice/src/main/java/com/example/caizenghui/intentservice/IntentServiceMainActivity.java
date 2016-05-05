package com.example.caizenghui.intentservice;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class IntentServiceMainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_service_main);

        findViewById(R.id.btn_start_service).setOnClickListener(this);

    }
    Intent intent ;
    @Override
    public void onClick(View v) {
        if (intent ==null){
            intent = new Intent(this, MyIntentService.class);
        }
        int i = v.getId();
        if (i == R.id.btn_start_service) {
            // 下面这种形式连续 start 才会在同一个线程中执行；
            // 正常第二次点击与第一次点击不会在同一个线程执行；
            // 每一个 intent 处理完后会调用 stopSelf(msg.arg1)；调用该方法时若已有intent 待处理，则 msg.arg1 已更新，故service 不会被stop；否则会被stop；再有 intent 待处理则在新线程；
            startService(intent);
            startService(intent);
            startService(intent);
        }
    }
}
