package org.example.DAO;

import org.example.Model.Customer;
import org.example.Model.ParkingSpot;
import org.example.Model.Reservation;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReservationDaoList implements  ReservationDao{

    //instance
    private static ReservationDaoList instance;

    //static array list with parking spots
    ArrayList<Reservation> reservations = new ArrayList<>();

    //private constructor
    private ReservationDaoList(){};

    //public static methods that handle the instance
    public static ReservationDaoList getInstance() {
        if (instance == null) {
            instance = new ReservationDaoList();
        }
        return instance;
    }


    @Override
    public Reservation saveReservation(Reservation reservation) {
        reservations.add(reservation);
        return null;
    }

    @Override
    public Reservation vacateParkingSpot(Reservation reservation) {
        reservation.setActive(false);
        reservation.setEndingTime(LocalDateTime.now());
        reservation.getParkingSpot().setOccupied(false);
        System.out.println(reservation.printTicket());
        return null;
    }

    @Override
    public ArrayList<Reservation> showOngoingReservations() {
        return null;
    }

    @Override
    public Reservation findById(String id) {
        for (Reservation element : reservations){
            if (element.getId().equals(id)){
                return element;
            }
        }
        return null;
    }
}
