package com.jb.project.andfile.tellmewhere.Model;

import android.util.Log;

import io.realm.Realm;

/**
 * Created by Alexander on 13.05.2017.
 */

public class DBHandler {


    public static void addNewPlace (Result result){


        Realm realm = Realm.getDefaultInstance();


        realm.beginTransaction();
        try{
            realm.copyToRealmOrUpdate(result);
        }catch (Exception e){
            Log.e("database","Error writing");
        }finally {
            realm.commitTransaction();
        }





    }
}
