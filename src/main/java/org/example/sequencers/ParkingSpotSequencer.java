package org.example.sequencers;

public class ParkingSpotSequencer {

    private static int currentId;

    public static String nextId(){
        return "00" + ++currentId;
    }

    public static String getCurrentId(){
        return "00" + currentId;
    }

}
