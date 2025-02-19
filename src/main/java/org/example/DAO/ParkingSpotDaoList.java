package org.example.DAO;

import org.example.Model.ParkingSpot;
import org.example.Model.VehicleSort;

import java.util.ArrayList;

public class ParkingSpotDaoList implements ParkingSpotDao{

    //instance
    private static ParkingSpotDaoList instance;

    //static array list with parking spots
    ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();

    //private constructor
    private ParkingSpotDaoList(){};

    //public static methods that handle the instance
    public static ParkingSpotDaoList getInstance() {
        if (instance == null) {
            instance = new ParkingSpotDaoList();
        }
        return instance;
    }

    @Override
    public ArrayList<ParkingSpot> searchAllParkingSpotsOfASort(VehicleSort vehicleSort) {
        return null;
    }

    @Override
    public ArrayList<ParkingSpot> searchAllParkingSpots() {
        ArrayList<ParkingSpot> tempArray = new ArrayList<>();
        for (ParkingSpot element : parkingSpots){
            if (!element.isOccupied()){
                tempArray.add(element);
            }
        }
        return tempArray;
    }

    @Override
    public ParkingSpot searchFirstAvailableParkingSpotFromASort(VehicleSort vehicleSort) {

        for (ParkingSpot element : parkingSpots){
            if (element.getParkingSort().equals(vehicleSort) && ! element.isOccupied()){
                return element;
            } else {
                System.out.println("There's none available parking spot for that type of vehicle in this moment.");
            }
        }
        return null;
    }

    @Override
    public ParkingSpot saveParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }
}
