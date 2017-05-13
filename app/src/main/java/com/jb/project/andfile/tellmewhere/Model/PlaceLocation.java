package com.jb.project.andfile.tellmewhere.Model;

import io.realm.RealmObject;

/**
 * Created by Alexander on 13.05.2017.
 */

public class PlaceLocation extends RealmObject{

    public PlaceLocation() {
    }

    public double lat;
    public double lng;
}
