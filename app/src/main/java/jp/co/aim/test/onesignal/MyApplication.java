package jp.co.aim.test.onesignal;

import android.app.Application;

/**
 * Created by taichi.sato on 2017/09/06.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
