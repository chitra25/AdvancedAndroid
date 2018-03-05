package com.hfad.advancedandroid.view;

import dagger.Binds;
import dagger.Module;

/**
 * Created by CHITRANGI on 3/5/2018.
 */
@Module
public abstract class NavigationModule {

    @Binds
    abstract ScreenNavigator provideScreenNavigator(DefaultScreenNavigator screenNavigator);
}
