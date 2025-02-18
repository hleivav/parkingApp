package org.example.DAO;

import org.example.Model.ParkingSpot;
import org.example.Model.VehicleSort;

import java.util.ArrayList;

public interface ParkingSpotDao {
    ParkingSpot saveParkingSpot(ParkingSpot parkingSpot);
    ArrayList<ParkingSpot> searchAllParkingSpotsOfASort(VehicleSort vehicleSort);
    ArrayList<ParkingSpot> searchAllParkingSpots();
    ParkingSpot searchFirstAvailableParkingSpotFromASort(VehicleSort vehicleSort);

}
