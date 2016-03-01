package utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * @author caizenghui
 */
public class ToastUtils {

    private static Toast mToast;

    public static void showToast(Context context, CharSequence text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

    public static final void showToast(Context context, int resId) {
        showToast(context, context.getText(resId));
    }

    public static void cancelToast() {
        if (mToast != null) {
            mToast.cancel();
        }
    }
}
