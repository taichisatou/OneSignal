package jp.co.aim.test.onesignal;

/**
 * Created by x-taichis on 2017/05/15.
 *
 * OneSignalのPushを受信のハンドリングを行う場合の反応
 */
public class AppNotificationReceivedHandler {
//        implements OneSignal.NotificationReceivedHandler {
//
//    @Override
//    public void notificationReceived(OSNotification notification) {
//
//        JSONObject data = notification.payload.additionalData;
//
//        final SharedPreferences sharedPreferences =
//                PreferenceManager.getDefaultSharedPreferences( MyApplication.getAppContext());
//
//        boolean isPushReceive = sharedPreferences.getBoolean(
//                PreferenceConst.KEY_PUSH_NOTIFICATION_CHECKED, true);
//
//        LogUtil.e("AppNotificationReceivedHandler","AppNotificationReceivedHandler");
//
//        // 表示するデータが存在しない場合、またはPush非受信設定の場合
//        if (data == null || !isPushReceive) {
//            NotificationManager manager = (NotificationManager)
//                    MyApplication.getAppContext().getSystemService(Context.NOTIFICATION_SERVICE);
//            manager.cancel(notification.androidNotificationId);
//        }
//
//    }
}
