package utils;

import android.text.TextUtils;
import android.widget.Toast;

import com.example.caizenghui.gradleuse.MyApplication;

/**
 * @author caizenghui
 *
 */
public class ToastUtils {

	private static Toast mToast;

	public static void showToast(CharSequence text) {
		if (TextUtils.isEmpty(text)) {
			return;
		}
		if (mToast == null) {
			mToast = Toast.makeText(MyApplication.getApplication(), text, Toast.LENGTH_SHORT);
		}
		else {
			mToast.setText(text);
			mToast.setDuration(Toast.LENGTH_SHORT);
		}
		mToast.show();
	}

	public static final void showToast(int resId) {
		showToast(MyApplication.getApplication().getText(resId));
	}

	public static void cancelToast() {
		if (mToast != null) {
			mToast.cancel();
		}
	}
}
