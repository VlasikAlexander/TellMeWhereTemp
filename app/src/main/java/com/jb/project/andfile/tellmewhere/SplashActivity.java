package com.jb.project.andfile.tellmewhere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jb.project.andfile.tellmewhere.Model.DBHandler;
import com.jb.project.andfile.tellmewhere.Model.Result;

import io.realm.Realm;
import io.realm.RealmResults;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        Result result = new Result();

        result.id = "Alex";
        result.name = "Nata";

        DBHandler.addNewPlace(result);

        RealmResults<Result> result1 = Realm.getDefaultInstance().where(Result.class).findAll();
        Log.e ("DataBase",result1.toString() );
    }
}
