package com.jb.project.andfile.tellmewhere;

import android.app.Application;
import android.content.Context;

import io.realm.Realm;

/**
 * Created by Alexander on 13.05.2017.
 */

public class TellMEApp extends Application
{

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(getApplicationContext());
    }
}
