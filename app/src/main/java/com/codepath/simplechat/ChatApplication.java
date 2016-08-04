package com.codepath.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Message.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("93bd0b59a90d46b1999e484431b83f41")
        .server("https://simplechatclient.herokuapp.com/parse/")
        .addNetworkInterceptor(new ParseLogInterceptor()).build());
    }
}
