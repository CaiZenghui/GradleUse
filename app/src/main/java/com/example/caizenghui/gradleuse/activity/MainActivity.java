package com.example.caizenghui.gradleuse.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caizenghui.gradleuse.R;
import com.example.caizenghui.share.BaseMainActivity;
import com.google.zxing.client.android.CaptureActivity;

import utils.IntentUtils;

public class MainActivity extends BaseMainActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_barscanner).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_barscanner:{
                IntentUtils.startActivity(this, new Intent(this, CaptureActivity.class));
                break;
            }
        }
    }
}
