package net.sourceforge.weixinbase.utils;

import android.content.Context;

/**
 * Created by caizenghui on 16/3/3.
 */
public class Utils {

    private static Context mContext;

    public static void setContext(Context context){
        mContext = context;
    }

    public static String getAppId() {
        try {
            return mContext.getPackageName();
        } catch (Exception e) {
        }
        return null;
    }

}
