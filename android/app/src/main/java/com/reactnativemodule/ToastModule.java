package com.reactnativemodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.content.Context;
import android.os.BatteryManager;
import android.util.Log;
import android.widget.Toast;

import static android.content.Context.BATTERY_SERVICE;

public class ToastModule extends ReactContextBaseJavaModule {
    //constructor
    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    //Mandatory function getName that specifies the module name
    @Override
    public String getName() {
        return "ToastModule";
    }
    //Custom function that we are going to export to JS

    @ReactMethod
    public void showToast(String message) {
        Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public int getBatteryLevel() {
        int batLevel = 0;
        BatteryManager bm = (BatteryManager) getCurrentActivity().getSystemService(BATTERY_SERVICE);
        batLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
        Log.d("-->>", "batLevel = " + batLevel);
        return batLevel;
    }
}