package com.hfad.advancedandroid.view;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;

/**
 * Created by CHITRANGI on 3/5/2018.
 */

public interface ScreenNavigator {

    void initWithRouter(Router router, Controller rootScreen);
    boolean pop();
    void clear();
}
