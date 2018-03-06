package com.hfad.advancedandroid.model;

import com.ryanharter.auto.value.moshi.MoshiAdapterFactory;
import com.squareup.moshi.JsonAdapter;

/**
 * Created by CHITRANGI on 3/5/2018.
 */
@MoshiAdapterFactory
public abstract class AdapterFactory implements JsonAdapter.Factory {

    public static JsonAdapter.Factory create(){
        return new AutoValueMoshi_AdapterFactory();
    }

}
