package com.jb.project.andfile.tellmewhere.Model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Alexander on 13.05.2017.
 */

public class Result extends RealmObject {

    public Result() {
    }

    @PrimaryKey
    public String id;

    public MyGeometry geometry;
    public String icon;
    public String name;
    public OpenHours opening_hours;
    public RealmList<Photos> photos;
    public String place_id;
    //public RealmList<AlternativeId> alt_ids; // Alternatives id optional
    public String reference;
    public RealmList<Types> types;
    public String vicinity;


}
