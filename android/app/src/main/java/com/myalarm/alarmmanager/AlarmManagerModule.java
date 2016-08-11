package com.myalarm.alarmmanager;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import java.util.Map;

// these classes are required for module
import android.widget.Toast;
import android.os.Bundle;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;

public class AlarmManagerModule extends ReactContextBaseJavaModule {

  public AlarmManagerModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "AlarmManagerAndroid";
  }

  @ReactMethod
  public void setAlarm(int time){
    Intent intent = new Intent(getReactApplicationContext(), MyBroadcastReceiver.class);
    PendingIntent pendingIntent = PendingIntent.getBroadcast(
                getReactApplicationContext(), 234324243, intent, 0);

    AlarmManager alarmManager = (AlarmManager) getReactApplicationContext().getSystemService(getReactApplicationContext().ALARM_SERVICE);
    alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
                + (time * 1000), pendingIntent);
    Toast.makeText(getReactApplicationContext(), "Alarm set in " + time + " seconds", Toast.LENGTH_LONG).show();
  }

}
