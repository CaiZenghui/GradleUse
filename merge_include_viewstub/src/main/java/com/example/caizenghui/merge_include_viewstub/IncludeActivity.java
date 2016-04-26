package com.example.caizenghui.merge_include_viewstub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IncludeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_include);

        findViewById(R.id.include).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
