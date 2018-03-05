package com.hfad.advancedandroid.dependencyinjection;

import com.bluelinelabs.conductor.Controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import dagger.MapKey;

/**
 * Created by CHITRANGI on 3/1/2018.
 */
@MapKey
@Target(ElementType.METHOD)
public @interface ControllerKey {

    Class<? extends Controller> value();
}
