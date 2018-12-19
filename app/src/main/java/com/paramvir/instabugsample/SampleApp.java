package com.paramvir.instabugsample;

import android.app.Application;

import com.instabug.library.Instabug;
import com.instabug.library.invocation.InstabugInvocationEvent;

public class SampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        new Instabug.Builder(this, "387c0cdf9b042a29e6c3870c5c21a938")
                .setInvocationEvents(InstabugInvocationEvent.SHAKE, InstabugInvocationEvent.SCREENSHOT)
                .build();
    }
}
