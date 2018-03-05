package com.hfad.advancedandroid.baseapplication;

import android.content.Context;
import android.support.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;
import com.hfad.advancedandroid.dependencyinjection.Injector;

/**
 * Created by CHITRANGI on 3/1/2018.
 */

public abstract class BaseController extends Controller {

    private boolean injected=false;

    @Override
    protected void onContextAvailable(@NonNull Context context) {
        if(!injected){
            Injector.inject(this);
            injected=true;
        }
        super.onContextAvailable(context);
    }
}
