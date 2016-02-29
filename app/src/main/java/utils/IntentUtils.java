package utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

import java.util.List;

/**
 * Created by caizenghui on 16/2/29.
 */
public class IntentUtils {
    public static boolean isIntentAvailable(Context context, Intent intent) {
        final PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> list = packageManager.queryIntentActivities(intent,
                PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() > 0;
    }

    public static boolean isIntentAvailable(Context context, String action) {
        final PackageManager packageManager = context.getPackageManager();
        final Intent intent = new Intent(action);
        List<ResolveInfo> list =
                packageManager.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() > 0;
    }

    public static void startActivity(Activity activity, Intent intent) {
        if (isIntentAvailable(activity, intent)) {
            activity.startActivity(intent);
        } else {
            ToastUtils.showToast("invalid intent");
        }
    }

    public static void startActivity(Activity activity, String action) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(action));
        if (isIntentAvailable(activity, intent)) {
            activity.startActivity(intent);
        } else {
            ToastUtils.showToast("invalid intent");
        }
    }
}
