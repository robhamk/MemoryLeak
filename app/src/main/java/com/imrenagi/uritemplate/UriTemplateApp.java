package com.imrenagi.uritemplate;

import android.app.Application;

import labs.anton.icenet.IceNet;
import labs.anton.icenet.IceNetConfig;

/**
 * Created by imrenagi on 16/01/15.
 */
public class UriTemplateApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initIceNet();
    }

    private void initIceNet() {
        IceNetConfig config = new IceNetConfig.Builder().setBaseUrl("http://private-b450cb-testing168.apiary-mock.com")
                .setContext(getApplicationContext())
                .build();
        IceNet.init(config);
    }
}
