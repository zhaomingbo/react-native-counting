package com.mubin.counting;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.mubin.counting.AppViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zmb on 11/3/17.
 */
public class AppReactPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        AppViewManager am = new AppViewManager();
        modules.add((NativeModule) am);
        return modules;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        // 注册AppViewManager
        List<ViewManager> viewManagers = new ArrayList<>();
        viewManagers.add(new AppViewManager());
        return viewManagers;
    }
}