package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class USConstants {

    public final static String US = "US";
    //51 states
    @SuppressWarnings("serial")
    public final static Map<String, String> mapOfUSStates = new HashMap<String, String>() {
        {
            put("NORTHBENGAL", "ONE");
            put("SOUTHBENGAL", "TWO");
            put("MIDBENGAL", "THREE");
         
        }
    };

    public final static List<String> listOfUSStatesCode = new ArrayList<String>(mapOfUSStates.keySet());
    public final static List<String> listOfUSStatesName = new ArrayList<String>(mapOfUSStates.values());
}