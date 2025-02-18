package org.example.Model;

import org.example.sequencers.CustomerSequencer;

public class Customer {
    //fields
    String customerId;
    String name;
    String phone;
    Vehicle vehicle;

    //constructor
    public Customer(String name, String phone, Vehicle vehicle) {
        this.name = name;
        this.phone = phone;
        this.vehicle = vehicle;
        this.customerId = CustomerSequencer.nextId();
    }

    //getters& setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        }
        throw new IllegalArgumentException("The name can't be empty. ");

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && !phone.trim().isEmpty()){
            this.phone = phone;
        }
        throw new IllegalArgumentException("The phone can't be empty. ");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        if (vehicle != null){
            this.vehicle = vehicle;
        }
        throw new IllegalArgumentException("The vehicle can't be empty. ");
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString(){
        return "Customer id: " + customerId + " Name: " + name + " Phone: " + phone + " Vehicle plate: " + vehicle.plateNumber + " Vehicle sort: " + vehicle.vehicleSort;
    }
}
