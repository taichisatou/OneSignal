package jp.co.aim.test.onesignal;

/**
 * Created by x-taichis on 2017/05/15.
 * 
 * OneSignalのNotificationをタッチした場合の反応
 */
public class AppNotificationOpenedHandler {
//        implements OneSignal.NotificationOpenedHandler {
//    @Override
//    public void notificationOpened(OSNotificationOpenResult result) {
//        OSNotificationAction.ActionType actionType = result.action.type;
//        JSONObject data = result.notification.payload.additionalData;
//
//        if (data != null) {
//            UserPushData notificationText = new UserPushData(data);
//            Intent intent = new Intent(MyApplication.getAppContext(), AppLauncherActivity.class);
//            intent.putExtra(NotificationConsts.EXTRA_USER_NOTIFICATION, notificationText);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
//            MyApplication.getAppContext().startActivity(intent);
//        }
//    }
}
