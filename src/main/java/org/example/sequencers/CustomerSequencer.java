package org.example.sequencers;

public class CustomerSequencer {

    private static int currentId;

    public static String nextId(){
        return "CustNo_00" + ++currentId;
    }

    public static String getCurrentId(){
        return "CustNo-00" + currentId;
    }
}
