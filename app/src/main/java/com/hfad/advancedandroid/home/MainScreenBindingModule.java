package com.hfad.advancedandroid.home;

import com.bluelinelabs.conductor.Controller;
import com.hfad.advancedandroid.dependencyinjection.ControllerKey;
import com.hfad.advancedandroid.trending.TrendingReposComponent;
import com.hfad.advancedandroid.trending.TrendingReposController;

import java.util.TreeMap;

import dagger.Binds;
import dagger.MapKey;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by CHITRANGI on 3/1/2018.
 */
@Module(subcomponents = {TrendingReposComponent.class,})
public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposInjector(TrendingReposComponent.Builder builder);

}
