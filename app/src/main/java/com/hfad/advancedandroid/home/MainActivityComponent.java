package com.hfad.advancedandroid.home;

import com.hfad.advancedandroid.dependencyinjection.ActivityScope;
import com.hfad.advancedandroid.view.NavigationModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by CHITRANGI on 2/27/2018.
 */
@ActivityScope
@Subcomponent(modules = {MainScreenBindingModule.class, NavigationModule.class, })
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

        @Override
        public void seedInstance(MainActivity instance) {

        }

    }
}
