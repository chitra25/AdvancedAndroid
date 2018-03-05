package com.hfad.advancedandroid.baseapplication;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CHITRANGI on 2/26/2018.
 */
@Module
public class ApplicationModule {

    private final Application application;

    ApplicationModule(Application application){
        this.application=application;
    }

    @Provides
    Context provideApplicationContext(){
        return application;
    }
}
