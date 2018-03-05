package com.hfad.advancedandroid.dependencyinjection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by CHITRANGI on 3/1/2018.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ScreenScope {
}
