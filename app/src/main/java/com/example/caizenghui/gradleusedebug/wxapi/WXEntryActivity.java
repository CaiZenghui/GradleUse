package com.example.caizenghui.gradleusedebug.wxapi;


import utils.ToastUtils;

public class WXEntryActivity extends com.example.caizenghui.gradleuse.wxapi.WXEntryActivity {

    @Override
    protected void onResume() {
        super.onResume();

        ToastUtils.showToast(this,"??????????wei???????");
    }
}