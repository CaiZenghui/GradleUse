package net.sourceforge.weixinbase;

import android.content.Context;
import android.text.TextUtils;

public class Constants {
    // APP_ID 替换为你的应用从官方网站申请到的合法appId
//    public static final String APP_ID = "wx4f85782122dabe7d";
//    public static final String APP_ID = "wx436bf40413a3e9df";
    private static String APP_ID;

    public static String getWXAppId(Context context) {
        if (TextUtils.isEmpty(APP_ID)) {
            APP_ID = context.getPackageName().equals("com.example.caizenghui.gradleuse") ? "wx4f85782122dabe7d"
                    : "wx436bf40413a3e9df";
        }
        return APP_ID;
    }

    public static class ShowMsgActivity {
        public static final String STitle = "showmsg_title";
        public static final String SMessage = "showmsg_message";
        public static final String BAThumbData = "showmsg_thumb_data";
    }
}
