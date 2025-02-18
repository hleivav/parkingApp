package org.example.Model;

import org.example.sequencers.ReservationSequencer;

import java.time.LocalDateTime;

public class Reservation {

    //fields
    String id;
    Customer customer;
    ParkingSpot parkingSpot;
    LocalDateTime startingTime;
    LocalDateTime endingTime;
    Boolean active;
    //constructor

    public Reservation(Customer customer) {
        this.customer = customer;
        this.id = ReservationSequencer.nextId();
        //todo : Create a method that search between all free parking spots of the sort the vehicle is.
        //this.parkingSpot = checkForAvailable()
        this.active = true;
    }

    //getters
    public Boolean getActive() {
        return active;
    }

    public LocalDateTime getEndingTime() {
        return endingTime;
    }

    public LocalDateTime getStartingTime() {
        return startingTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getId() {
        return id;
    }

    //setters
    public void setStartingTime(LocalDateTime startingTime) {
        this.startingTime = startingTime;
    }

    public void setEndingTime(LocalDateTime endingTime) {
        this.endingTime = endingTime;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
