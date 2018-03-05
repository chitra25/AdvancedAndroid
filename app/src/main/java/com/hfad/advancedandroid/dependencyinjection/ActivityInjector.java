package com.hfad.advancedandroid.dependencyinjection;

import android.app.Activity;
import android.content.Context;

import com.hfad.advancedandroid.baseapplication.BaseAcitivity;
import com.hfad.advancedandroid.baseapplication.MyApplication;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.android.AndroidInjector;

/**
 * Created by CHITRANGI on 3/1/2018.
 */

public class ActivityInjector {

    private final Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>> activityInjectors;
    private final Map<String, AndroidInjector<? extends Activity>> cache=new HashMap<>();

    @Inject
    ActivityInjector(Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>> activityInjectors, Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>> activityInjectors1){

        this.activityInjectors = activityInjectors1;
    }

    void inject(Activity activity){
        if(!(activity instanceof BaseAcitivity)){
            throw new IllegalArgumentException("Activity must extend BaseActivity");
        }

        String instanceId = ((BaseAcitivity)activity).getInstanceId();
        if(cache.containsKey(instanceId)){
            //noinspection unchecked
            ((AndroidInjector<Activity>)cache.get(instanceId)).inject(activity);
            return;
        }
        else{
            AndroidInjector.Factory<Activity> injectFactory =
                    (AndroidInjector.Factory<Activity>)activityInjectors.get(activity.getClass()).get();
            AndroidInjector<Activity> injector=injectFactory.create(activity);
            cache.put(instanceId, injector);
            injector.inject(activity);
        }
    }

    void clear(Activity activity){
        if(!(activity instanceof BaseAcitivity)){
            throw new IllegalArgumentException("Activity must extend Base Activity");
        }
        else{
            cache.remove(((BaseAcitivity) activity).getInstanceId());
        }
    }

    static ActivityInjector get(Context context){
       return ((MyApplication)context.getApplicationContext()).getActivityInjector();
    }
}
