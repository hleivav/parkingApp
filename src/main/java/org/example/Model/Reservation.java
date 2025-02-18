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

    public Reservation(Customer customer, ParkingSpot parkingSpot) {
        this.customer = customer;
        this.id = ReservationSequencer.nextId();
        this.parkingSpot = parkingSpot;
        this.startingTime = LocalDateTime.now();
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

    @Override
    public String toString(){
        return "Reservation number: " + id + "\n Customer name: " + customer.getName() + " Vehicle type: " + customer.vehicle.vehicleSort +
                " Plate number: " + customer.vehicle.plateNumber + " Start parking at: " + startingTime;
    }
}
