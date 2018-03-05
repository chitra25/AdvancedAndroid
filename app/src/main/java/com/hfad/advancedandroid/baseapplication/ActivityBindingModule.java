package com.hfad.advancedandroid.baseapplication;

import android.app.Activity;

import com.hfad.advancedandroid.home.MainActivity;
import com.hfad.advancedandroid.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by CHITRANGI on 2/27/2018.
 */
@Module(subcomponents = {
        MainActivityComponent.class
})
public abstract class ActivityBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);
}
