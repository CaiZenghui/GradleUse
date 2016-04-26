package com.example.caizenghui.merge_include_viewstub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_include_main);

        findViewById(R.id.btn_include).setOnClickListener(this);
        findViewById(R.id.btn_merge).setOnClickListener(this);
        findViewById(R.id.btn_view_stub).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_include) {
            startActivity(new Intent(this,IncludeActivity.class));
        }else if (i == R.id.btn_merge){
            startActivity(new Intent(this,MergeActivity.class));
        }
    }
}
