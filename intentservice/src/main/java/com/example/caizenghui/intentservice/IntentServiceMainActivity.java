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
            startService(intent);
            startService(intent);
            startService(intent);
        }
    }
}
