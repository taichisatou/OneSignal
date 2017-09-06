package jp.co.aim.test.onesignal;

//import com.onesignal.NotificationExtenderService;
//import com.onesignal.OSNotificationDisplayedResult;
//import com.onesignal.OSNotificationReceivedResult;

/**
 * Created by x-taichis on 2017/05/15.
 * <p>
 * OneSignalのPushを受信した場合の反応
 */
public class AppNotificationExtenderService {
//        extends NotificationExtenderService {
//    @Override
//    protected boolean onNotificationProcessing(OSNotificationReceivedResult notification) {
//
//        OverrideSettings overrideSettings = new OverrideSettings();
//        JSONObject data = notification.payload.additionalData;
//
//        LogUtil.e("AppNotificationExtenderService","AppNotificationExtenderService");
//
//        final SharedPreferences sharedPreferences =
//                PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//        boolean isPushReceive = sharedPreferences.getBoolean(
//                PreferenceConst.KEY_PUSH_NOTIFICATION_CHECKED, true);
//
//        // 表示するデータが存在する、かつPush受信設定の場合
//        if (data != null && isPushReceive) {
//
//            final UserPushData notificationText = new UserPushData(data);
//
//            // Notificationをフックして、表示設定を上書きする
//            overrideSettings.extender = new NotificationCompat.Extender() {
//                @Override
//                public NotificationCompat.Builder extend(NotificationCompat.Builder builder) {
//
//                    builder.setContentIntent(NotificationUtils.createPendingIntent(
//                            getApplicationContext(), notificationText
//                    ));
//
//                    // カスタム
//                    RemoteViews customView = new RemoteViews(getApplicationContext().getPackageName(),
//                            R.layout.notification_custom_layout);
//                    customView.setTextViewText(R.id.push_title_text, notificationText.getPushTitle());
//                    customView.setTextViewText(R.id.push_main_text, notificationText.getPushText());
//                    customView.setImageViewResource(R.id.push_icon, R.mipmap.ic_launcher);
//                    builder.setContent(customView);
//
//                    return builder;
//                }
//            };
//            OSNotificationDisplayedResult displayedResult = displayNotification(overrideSettings);
//
//            return true;
//        }
//        return true;
//    }
}
