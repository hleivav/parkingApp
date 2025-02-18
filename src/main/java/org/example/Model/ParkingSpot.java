package org.example.Model;

import org.example.sequencers.ParkingSpotSequencer;

public class ParkingSpot {

    //fields
    String id;
    boolean occupied;
    VehicleSort parkingSort;
    String reservationId;

    //constructor
    public ParkingSpot(VehicleSort parkingSort, String reservationId, Boolean occupied) {
        this.parkingSort = parkingSort;
        this.reservationId = reservationId;
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

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }
}
