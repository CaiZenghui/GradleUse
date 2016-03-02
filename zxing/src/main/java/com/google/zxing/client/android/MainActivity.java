package com.google.zxing.client.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caizenghui.share.BaseMainActivity;

import utils.IntentUtils;

public class MainActivity extends BaseMainActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscanner_main);
        findViewById(R.id.btn_barscanner).setOnClickListener(this);
        findViewById(R.id.btn_generate_qrcode).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_barscanner) {
            IntentUtils.startActivity(this, new Intent(this, CaptureActivity.class));
        }else if(i== R.id.btn_generate_qrcode){
            IntentUtils.startActivity(this, new Intent(this, GenerateQRCodeActivity.class));

        }
    }

}
