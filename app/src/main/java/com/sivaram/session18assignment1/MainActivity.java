package com.sivaram.session18assignment1;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Create Object of BatteryState Class
    BatteryState batteryStateReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize BatteryState object in OnCreate
        batteryStateReceiver = new BatteryState();

    }

    // Override OnStart Method which will register as Receiver
    @Override
    protected void onStart() {
        // Register Receiver with batteryStateReceiver Object and Add Intent Filter to get Battery Changed Event
        registerReceiver(batteryStateReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        super.onStart();
    }

    // override onStop Method to unregister Receiver
    @Override
    protected void onStop() {
        // Unregister Intent Receiver and pass the batteryStateReceiver Object.
        unregisterReceiver(batteryStateReceiver);
        super.onStop();
    }
}
