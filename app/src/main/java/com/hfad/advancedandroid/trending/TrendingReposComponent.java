package com.hfad.advancedandroid.trending;

import com.hfad.advancedandroid.dependencyinjection.ScreenScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by CHITRANGI on 3/1/2018.
 */
@ScreenScope
@Subcomponent
public interface TrendingReposComponent extends AndroidInjector<TrendingReposController> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TrendingReposController>{

    }
}
