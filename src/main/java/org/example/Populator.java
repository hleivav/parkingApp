package org.example;

import org.example.DAO.CustomerDaoList;
import org.example.DAO.ParkingSpotDaoList;
import org.example.Model.*;

public class Populator {

    public static void populator(){

        Vehicle v1 = new Vehicle("AAA565", VehicleSort.CAR);
        Vehicle v2 = new Vehicle("BBB565", VehicleSort.CAR);
        Vehicle v3 = new Vehicle("CCC565", VehicleSort.CAR);
        Vehicle v4 = new Vehicle("DDD565", VehicleSort.CAR);
        Vehicle v5 = new Vehicle("EEE565", VehicleSort.BUS);
        Vehicle v6 = new Vehicle("FFF565", VehicleSort.BUS);
        Vehicle v7 = new Vehicle("GGG565", VehicleSort.MOTORCYCLE);
        Vehicle v8 = new Vehicle("HHH565", VehicleSort.MOTORCYCLE);
        Vehicle v9 = new Vehicle("III565", VehicleSort.TRUCK);
        Vehicle v10 = new Vehicle("JJJ565", VehicleSort.TRUCK);

        Customer c1 = new Customer("Jair Bolsonaro", "0707007001", v1);
        Customer c2 = new Customer("Donald Trump", "0707007002", v2);
        Customer c3 = new Customer("Wladimir Putin", "0707007003", v3);
        Customer c4 = new Customer("Xi-Jing-Ping", "0707007004", v4);
        Customer c5 = new Customer("Nicolás Maduro", "0707007005", v5);
        Customer c6 = new Customer("Daniel Ortega", "0707007006", v6);
        Customer c7 = new Customer("Kim Il Sung", "0707007007", v7);
        Customer c8 = new Customer("Jean Marine Le Penn", "0707007008", v8);
        Customer c9 = new Customer("Xavier Milei", "0707007009", v9);
        Customer c10 = new Customer("Tayyip Erdogan", "0707007010", v10);

        CustomerDaoList.getInstance().registerCustomer(c1);
        CustomerDaoList.getInstance().registerCustomer(c2);
        CustomerDaoList.getInstance().registerCustomer(c3);
        CustomerDaoList.getInstance().registerCustomer(c4);
        CustomerDaoList.getInstance().registerCustomer(c5);
        CustomerDaoList.getInstance().registerCustomer(c6);
        CustomerDaoList.getInstance().registerCustomer(c7);
        CustomerDaoList.getInstance().registerCustomer(c8);
        CustomerDaoList.getInstance().registerCustomer(c9);
        CustomerDaoList.getInstance().registerCustomer(c10);

        ParkingSpot ps1 = new ParkingSpot(VehicleSort.CAR, false);
        ParkingSpot ps2 = new ParkingSpot(VehicleSort.CAR, false); 
        ParkingSpot ps3 = new ParkingSpot(VehicleSort.CAR, false); 
        ParkingSpot ps4 = new ParkingSpot(VehicleSort.CAR, false); 
        ParkingSpot ps5 = new ParkingSpot(VehicleSort.CAR, false); 
        ParkingSpot ps6 = new ParkingSpot(VehicleSort.CAR, false); 
        ParkingSpot ps7 = new ParkingSpot(VehicleSort.CAR, false); 
        ParkingSpot ps8 = new ParkingSpot(VehicleSort.CAR, false); 
        ParkingSpot ps9 = new ParkingSpot(VehicleSort.CAR, false); 
        ParkingSpot ps10 = new ParkingSpot(VehicleSort.CAR, false);
        ParkingSpot ps11 = new ParkingSpot(VehicleSort.CAR, false);
        ParkingSpot ps12 = new ParkingSpot(VehicleSort.CAR, false);
        ParkingSpot ps13 = new ParkingSpot(VehicleSort.BUS, false);
        ParkingSpot ps14 = new ParkingSpot(VehicleSort.BUS, false);
        ParkingSpot ps15 = new ParkingSpot(VehicleSort.BUS, false);
        ParkingSpot ps16 = new ParkingSpot(VehicleSort.BUS, false);
        ParkingSpot ps17 = new ParkingSpot(VehicleSort.BUS, false);
        ParkingSpot ps18 = new ParkingSpot(VehicleSort.MOTORCYCLE, false);
        ParkingSpot ps19 = new ParkingSpot(VehicleSort.MOTORCYCLE, false);
        ParkingSpot ps20 = new ParkingSpot(VehicleSort.MOTORCYCLE, false);
        ParkingSpot ps21 = new ParkingSpot(VehicleSort.MOTORCYCLE, false);
        ParkingSpot ps22 = new ParkingSpot(VehicleSort.MOTORCYCLE, false);
        ParkingSpot ps23 = new ParkingSpot(VehicleSort.MOTORCYCLE, false);
        ParkingSpot ps24 = new ParkingSpot(VehicleSort.TRUCK, false);
        ParkingSpot ps25 = new ParkingSpot(VehicleSort.TRUCK, false);
        ParkingSpot ps26 = new ParkingSpot(VehicleSort.TRUCK, false);
        ParkingSpot ps27 = new ParkingSpot(VehicleSort.TRUCK, false);
        ParkingSpot ps28 = new ParkingSpot(VehicleSort.TRUCK, false);
        ParkingSpot ps29 = new ParkingSpot(VehicleSort.TRUCK, false); 
        ParkingSpot ps30 = new ParkingSpot(VehicleSort.TRUCK, false);

        ParkingSpotDaoList.getInstance().saveParkingSpot(ps1);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps2);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps3);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps4);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps5);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps6);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps7);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps8);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps9);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps10);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps11);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps12);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps13);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps14);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps15);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps16);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps17);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps18);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps19);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps20);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps21);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps22);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps23);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps24);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps25);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps26);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps27);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps28);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps29);
        ParkingSpotDaoList.getInstance().saveParkingSpot(ps30);

        Reservation res1 = new Reservation(c1, ps1);
        ps1.setOccupied(true);
        Reservation res2 = new Reservation(c2, ps2);
        ps2.setOccupied(true);
        Reservation res3 = new Reservation(c3, ps3);
        ps3.setOccupied(true);
        Reservation res4 = new Reservation(c4, ps4);
        ps4.setOccupied(true);
        Reservation res5 = new Reservation(c5, ps13);
        ps13.setOccupied(true);
        Reservation res6 = new Reservation(c6, ps14);
        ps14.setOccupied(true);
        Reservation res7 = new Reservation(c7, ps18);
        ps18.setOccupied(true);
        Reservation res8 = new Reservation(c8, ps19);
        ps19.setOccupied(true);
        Reservation res9 = new Reservation(c9, ps24);
        ps24.setOccupied(true);
        Reservation res10 = new Reservation(c10, ps25); 
        ps25.setOccupied(true);
   }

}
