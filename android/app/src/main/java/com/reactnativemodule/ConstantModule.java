package com.reactnativemodule;

import android.widget.Toast;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ConstantModule extends ReactContextBaseJavaModule {
    //constructor
    public ConstantModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    //Mandatory function getName that specifies the module name
    @Override
    public String getName() {
        return "ConstantModule";
    }
    //Custom function that we are going to export to JS

    @ReactMethod
    public void getDate(Callback callback) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("BUILD_ENV", BuildConfig.BUILD_ENV);
        hm.put("Date", new Date().toString());
        WritableMap map = new WritableNativeMap();
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            map.putString(entry.getKey(), entry.getValue());
        }
        callback.invoke(map);
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("BUILD_ENV", BuildConfig.BUILD_ENV);
        constants.put("VERSION_CODE", String.valueOf(BuildConfig.VERSION_CODE));
        constants.put("VERSION_NAME", BuildConfig.VERSION_NAME);
        constants.put("BUILD_TYPE", BuildConfig.BUILD_TYPE);
        constants.put("Date", new Date().toString());
        return constants;
    }
}