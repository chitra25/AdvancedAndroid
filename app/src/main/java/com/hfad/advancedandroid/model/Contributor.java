package com.hfad.advancedandroid.model;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/**
 * Created by CHITRANGI on 3/5/2018.
 */
@AutoValue
public abstract class Contributor {

    public abstract long id();

    public abstract String name();

    @Json(name="avatar_url")
    public abstract String avatarUrl();

    public static JsonAdapter<Contributor> jsonAdapter(Moshi moshi){
        return new AutoValue_Contributor.MoshiJsonAdapter(moshi);
    }
}
