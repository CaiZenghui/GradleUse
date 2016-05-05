package com.example.caizenghui.gradleuse.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.caizenghui.ontrimmemory.OnTrimMemoryMainActivity;
import com.example.caizenghui.bounceview.BounceViewMainActivity;
import com.example.caizenghui.gradleuse.R;
import com.example.caizenghui.intentservice.IntentServiceMainActivity;
import com.example.caizenghui.share.BaseMainActivity;

import net.sourceforge.weixinbase.WXMainActivity;

import utils.IntentUtils;

public class MainActivity extends BaseMainActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_barscanner).setOnClickListener(this);
        findViewById(R.id.btn_weixin).setOnClickListener(this);
        findViewById(R.id.btn_intent_service).setOnClickListener(this);
        findViewById(R.id.btn_include_merge_viewstub).setOnClickListener(this);
        findViewById(R.id.btn_bounce_view).setOnClickListener(this);
        findViewById(R.id.btn_ontrimmemory).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_barscanner:{
                IntentUtils.startActivity(this, new Intent(this, com.google.zxing.client.android.MainActivity.class));
                break;
            }
            case R.id.btn_weixin:{
                IntentUtils.startActivity(this, new Intent(this, WXMainActivity.class));
                break;
            }
            case R.id.btn_intent_service:{
                IntentUtils.startActivity(this, new Intent(this, IntentServiceMainActivity.class));
                break;
            }
            case R.id.btn_include_merge_viewstub:{
                IntentUtils.startActivity(this, new Intent(this, com.example.caizenghui.merge_include_viewstub.MainActivity.class));
                break;
            }
            case R.id.btn_bounce_view:{
                IntentUtils.startActivity(this, new Intent(this, BounceViewMainActivity.class));
                break;
            }
            case R.id.btn_ontrimmemory:{
                IntentUtils.startActivity(this, new Intent(this, OnTrimMemoryMainActivity.class));
                break;
            }
        }
    }
}
