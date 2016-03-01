package com.example.caizenghui.barscanner;

import android.os.Bundle;
import android.view.View;

import com.example.caizenghui.share.BaseMainActivity;

public class BarScannerActivity extends BaseMainActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_scanner);

        findViewById(R.id.btn_back).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_back) {
            finish();
        }
    }
}
