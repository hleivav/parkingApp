package org.example;

import org.example.Model.ParkingSpot;
import org.example.Model.VehicleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSpotTest {

    @Test
    void testConstructorAndGetters() {
        ParkingSpot spot = new ParkingSpot(VehicleSort.CAR, false);

        assertNotNull(spot.getId());
        assertEquals(VehicleSort.CAR, spot.getParkingSort());
        assertFalse(spot.isOccupied());
    }

    @Test
    void testSetters() {
        ParkingSpot spot = new ParkingSpot(VehicleSort.CAR, false);

        spot.setParkingSort(VehicleSort.MOTORCYCLE);
        assertEquals(VehicleSort.MOTORCYCLE, spot.getParkingSort());

        spot.setOccupied(true);
        assertTrue(spot.isOccupied());
    }

    @Test
    void testToString() {
        ParkingSpot spot = new ParkingSpot(VehicleSort.CAR, true);
        String expected = "Parking spot No: " + spot.getId() + " Occupied: true Parking spot for: CAR";
        assertEquals(expected, spot.toString());
    }

    @Test
    void testUniqueIds() {
        ParkingSpot spot1 = new ParkingSpot(VehicleSort.CAR, false);
        ParkingSpot spot2 = new ParkingSpot(VehicleSort.MOTORCYCLE, true);
        assertNotEquals(spot1.getId(), spot2.getId());
    }

    @Test
    void testOccupiedStateChange() {
        ParkingSpot spot = new ParkingSpot(VehicleSort.CAR, false);
        assertFalse(spot.isOccupied());
        spot.setOccupied(true);
        assertTrue(spot.isOccupied());
    }


    @Test
    void testToStringAfterChanges() {
        ParkingSpot spot = new ParkingSpot(VehicleSort.CAR, false);
        String initialString = spot.toString();
        spot.setOccupied(true);
        spot.setParkingSort(VehicleSort.TRUCK);
        String newString = spot.toString();
        assertNotEquals(initialString, newString);
    }

    @Test
    void testAllVehicleSorts() {
        for (VehicleSort sort : VehicleSort.values()) {
            ParkingSpot spot = new ParkingSpot(sort, false);
            assertEquals(sort, spot.getParkingSort());
        }
    }



}
