package org.example;

import org.example.DAO.ParkingSpotDaoList;
import org.example.Model.ParkingSpot;
import org.example.Model.VehicleSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingTestDaoListTest {

    private ParkingSpotDaoList dao;

    @BeforeEach
    void setUp() {
        dao = ParkingSpotDaoList.getInstance();
        // Clear the list before each test
        dao.clearPP();
    }

    @Test
    void testGetInstance() {
        ParkingSpotDaoList instance1 = ParkingSpotDaoList.getInstance();
        ParkingSpotDaoList instance2 = ParkingSpotDaoList.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testSearchAllParkingSpotsOfASort() {
        // This method returns null, so we just verify that
        assertNull(dao.searchAllParkingSpotsOfASort(VehicleSort.CAR));
    }

    @Test
    void testSearchAllParkingSpots() {
        ParkingSpot spot1 = new ParkingSpot(VehicleSort.CAR, false);
        ParkingSpot spot2 = new ParkingSpot(VehicleSort.MOTORCYCLE, true);
        ParkingSpot spot3 = new ParkingSpot(VehicleSort.CAR, false);

        dao.saveParkingSpot(spot1);
        dao.saveParkingSpot(spot2);
        dao.saveParkingSpot(spot3);

        ArrayList<ParkingSpot> result = dao.searchAllParkingSpots();
        assertEquals(2, result.size());
        assertTrue(result.contains(spot1));
        assertTrue(result.contains(spot3));
        assertFalse(result.contains(spot2));
    }

    @Test
    void testSearchFirstAvailableParkingSpotFromASort() {
        ParkingSpot spot1 = new ParkingSpot(VehicleSort.CAR, true);
        ParkingSpot spot2 = new ParkingSpot(VehicleSort.MOTORCYCLE, false);
        ParkingSpot spot3 = new ParkingSpot(VehicleSort.CAR, false);

        dao.saveParkingSpot(spot1);
        dao.saveParkingSpot(spot2);
        dao.saveParkingSpot(spot3);

        ParkingSpot result = dao.searchFirstAvailableParkingSpotFromASort(VehicleSort.CAR);
        assertSame(spot3, result);

        result = dao.searchFirstAvailableParkingSpotFromASort(VehicleSort.MOTORCYCLE);
        assertSame(spot2, result);

        result = dao.searchFirstAvailableParkingSpotFromASort(VehicleSort.TRUCK);
        assertNull(result);
    }

    @Test
    void testSaveParkingSpot() {
        ParkingSpot spot = new ParkingSpot(VehicleSort.CAR, false);
        ParkingSpot result = dao.saveParkingSpot(spot);
        assertSame(spot, result);
        assertTrue(dao.checkIfSpotInList(spot));
    }

    @Test
    void testSearchAllParkingSpotsWhenAllOccupied() {
        ParkingSpot spot1 = new ParkingSpot(VehicleSort.CAR, true);
        ParkingSpot spot2 = new ParkingSpot(VehicleSort.MOTORCYCLE, true);

        dao.saveParkingSpot(spot1);
        dao.saveParkingSpot(spot2);

        ArrayList<ParkingSpot> result = dao.searchAllParkingSpots();
        assertTrue(result.isEmpty());
    }

    @Test
    void testSearchFirstAvailableParkingSpotFromASortWhenNoneAvailable() {
        ParkingSpot spot1 = new ParkingSpot(VehicleSort.CAR, true);
        ParkingSpot spot2 = new ParkingSpot(VehicleSort.CAR, true);

        dao.saveParkingSpot(spot1);
        dao.saveParkingSpot(spot2);

        ParkingSpot result = dao.searchFirstAvailableParkingSpotFromASort(VehicleSort.CAR);
        assertNull(result);
    }

    @Test
    void testSaveMultipleParkingSpots() {
        ParkingSpot spot1 = new ParkingSpot(VehicleSort.CAR, false);
        ParkingSpot spot2 = new ParkingSpot(VehicleSort.MOTORCYCLE, false);

        dao.saveParkingSpot(spot1);
        dao.saveParkingSpot(spot2);

        assertEquals(2, dao.getListSize());
        assertTrue(dao.checkIfSpotInList(spot1));
        assertTrue(dao.checkIfSpotInList(spot2));
    }

}
