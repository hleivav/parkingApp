package org.example.Model;

public class Vehicle {
    //fields
    String plateNumber;
    VehicleSort vehicleSort;

    //constructor
    public Vehicle(String plateNumber, VehicleSort vehicleSort) {
        this.plateNumber = plateNumber;
        this.vehicleSort = vehicleSort;
    }

    //Getters & setters

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public VehicleSort getVehicleSort() {
        return vehicleSort;
    }

    public void setVehicleSort(VehicleSort vehicleSort) {
        this.vehicleSort = vehicleSort;
    }
}
