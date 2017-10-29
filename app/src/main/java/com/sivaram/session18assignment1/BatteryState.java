package com.sivaram.session18assignment1;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 27/10/2017.
 */

public class BatteryState extends BroadcastReceiver {

    // Override onReceive Method to retrieve Battery Level
    @Override
    public void onReceive(Context context, Intent intent) {

        // get Value from BatteryManager object with the received Intent.
        int batteryLevelIntent = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 1);

        // Create Object of TextView which is in MainActivity.
        TextView batteryLevelTextView = (TextView) ((Activity)context).findViewById(R.id.batteryLevelPercentageTextView);

        // set battery % remaining value to TextView.
        batteryLevelTextView.setText("Battery Level Remaining : " +  String.valueOf(batteryLevelIntent) + " % ");

    }
}
