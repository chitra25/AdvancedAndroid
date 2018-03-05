package com.hfad.advancedandroid.baseapplication;

import android.app.Application;

import com.hfad.advancedandroid.dependencyinjection.ActivityInjector;

import javax.inject.Inject;

/**
 * Created by CHITRANGI on 2/26/2018.
 */

public class MyApplication extends Application {
    @Inject ActivityInjector activityInjector;
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component=DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component.inject(this);
    }

    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }
}
