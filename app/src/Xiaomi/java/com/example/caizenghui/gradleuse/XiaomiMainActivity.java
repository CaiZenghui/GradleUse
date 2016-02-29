package com.example.caizenghui.gradleuse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class XiaomiMainActivity extends BaseMainActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_flavor = (TextView) findViewById(R.id.tv_flavor);
        tv_flavor.setText("MainActivity-->" + "XiaomiMainActivity");

        findViewById(R.id.btn_exclude).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_exclude:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("gradle://exclude"));
//                Intent intent = new Intent(this, ExcludeActivity.class);
                startActivity(intent);
                break;
        }
    }
}
