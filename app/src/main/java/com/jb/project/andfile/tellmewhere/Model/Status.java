package com.jb.project.andfile.tellmewhere.Model;

/**
 * Created by Alexander on 13.05.2017.
 */

public class Status {

    private final static String OK = "OK";
    private final String ZERO_RESULTS = "ZERO_RESULTS";
    private final String OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT";
    private final String REQUEST_DENIED = "REQUEST_DENIED";
    private final String INVALID_REQUEST = "INVALID_REQUEST";


    public static String status;

    public static boolean isOk(){


        return status.equals(OK);
    }


}
