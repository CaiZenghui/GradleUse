package net.sourceforge.weixinbase;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

public class WXMainActivity extends Activity {

    private static final int TIMELINE_SUPPORTED_VERSION = 0x21020001;

    private Button gotoBtn, regBtn, launchBtn, checkBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry);

        // 通过WXAPIFactory工厂，获取IWXAPI的实例


        regBtn = (Button) findViewById(R.id.reg_btn);
        regBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 将该app注册到微信
                IWXAPI api = WXAPIFactory.createWXAPI(WXMainActivity.this, Constants.getWXAppId(WXMainActivity.this), false);
                api.registerApp(Constants.getWXAppId(WXMainActivity.this));
            }
        });

        gotoBtn = (Button) findViewById(R.id.goto_send_btn);
        gotoBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(WXMainActivity.this, SendToWXActivity.class));
//                finish();
            }
        });

        launchBtn = (Button) findViewById(R.id.launch_wx_btn);
        launchBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                IWXAPI api = WXAPIFactory.createWXAPI(WXMainActivity.this, Constants.getWXAppId(WXMainActivity.this), false);
                Toast.makeText(WXMainActivity.this, "launch result = " + api.openWXApp(), Toast.LENGTH_LONG).show();
            }
        });

        checkBtn = (Button) findViewById(R.id.check_timeline_supported_btn);
        checkBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                IWXAPI api = WXAPIFactory.createWXAPI(WXMainActivity.this, Constants.getWXAppId(WXMainActivity.this), false);
                int wxSdkVersion = api.getWXAppSupportAPI();
                if (wxSdkVersion >= TIMELINE_SUPPORTED_VERSION) {
                    Toast.makeText(WXMainActivity.this, "wxSdkVersion = " + Integer.toHexString(wxSdkVersion) + "\ntimeline supported", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(WXMainActivity.this, "wxSdkVersion = " + Integer.toHexString(wxSdkVersion) + "\ntimeline not supported", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}