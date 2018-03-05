package com.hfad.advancedandroid.baseapplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by CHITRANGI on 2/26/2018.
 */
@Singleton
@Component(modules = {ApplicationModule.class, ActivityBindingModule.class})
public interface ApplicationComponent {
    void inject(MyApplication myApplication);
}
