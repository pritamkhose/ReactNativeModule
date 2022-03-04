package com.reactnativemodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.util.Log;

public class ConsoleModule extends ReactContextBaseJavaModule {
    //constructor
    public ConsoleModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    //Mandatory function getName that specifies the module name
    @Override
    public String getName() {
        return "ConsoleModule";
    }
    //Custom function that we are going to export to JS

    @ReactMethod
    public void log(String tag, String message) {
        Log.d(tag,  message);
    }
}