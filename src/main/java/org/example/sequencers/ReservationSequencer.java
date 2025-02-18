package org.example.sequencers;

public class ReservationSequencer {

    private static int currentId;

    public static String nextId(){
        return "ReservationNo_00" + ++currentId;
    }

    public static String getCurrentId(){
        return "ReservationNo-00" + currentId;
    }

}
