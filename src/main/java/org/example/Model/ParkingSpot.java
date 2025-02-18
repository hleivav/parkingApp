package org.example.Model;

import org.example.sequencers.ParkingSpotSequencer;

public class ParkingSpot {

    //fields
    String id;
    boolean occupied;
    VehicleSort parkingSort;

    //constructor
    public ParkingSpot(VehicleSort parkingSort, Boolean occupied) {
        this.parkingSort = parkingSort;
        this.id = ParkingSpotSequencer.nextId();
        this.occupied = occupied;
    }

    //setters & getters
    public VehicleSort getParkingSort() {
        return parkingSort;
    }

    public void setParkingSort(VehicleSort parkingSort) {
        this.parkingSort = parkingSort;
    }

}
