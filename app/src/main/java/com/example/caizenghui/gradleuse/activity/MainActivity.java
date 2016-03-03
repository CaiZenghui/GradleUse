package com.example.caizenghui.gradleuse.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caizenghui.gradleuse.R;
import com.example.caizenghui.gradleuse.wxapi.WXEntryActivity;
import com.example.caizenghui.share.BaseMainActivity;

import utils.IntentUtils;

public class MainActivity extends BaseMainActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_barscanner).setOnClickListener(this);
        findViewById(R.id.btn_weixin).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_barscanner:{
                IntentUtils.startActivity(this, new Intent(this, com.google.zxing.client.android.MainActivity.class));
                break;
            }
            case R.id.btn_weixin:{
                IntentUtils.startActivity(this, new Intent(this, WXEntryActivity.class));
                break;
            }
        }
    }
}
