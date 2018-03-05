package com.hfad.advancedandroid.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bluelinelabs.conductor.Controller;
import com.hfad.advancedandroid.R;
import com.hfad.advancedandroid.baseapplication.BaseAcitivity;
import com.hfad.advancedandroid.trending.TrendingReposController;

public class MainActivity extends BaseAcitivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected Controller initialScreen() {
        return new TrendingReposController();
    }
}
