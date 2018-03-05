package com.hfad.advancedandroid.view;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.hfad.advancedandroid.dependencyinjection.ActivityScope;
import com.hfad.advancedandroid.dependencyinjection.ScreenInjector;

import javax.inject.Inject;

/**
 * Created by CHITRANGI on 3/5/2018.
 */
@ActivityScope
public class DefaultScreenNavigator implements ScreenNavigator {

    Router router;

    @Inject
    DefaultScreenNavigator(){

    }

    @Override
    public void initWithRouter(Router router, Controller rootScreen) {
        this.router=router;
        if(!router.hasRootController()){
            router.setRoot(RouterTransaction.with(rootScreen));
        }
    }

    @Override
    public boolean pop() {
        return router!=null && router.handleBack();
    }

    @Override
    public void clear() {
        router=null;
    }
}
