package org.example.DAO;

import org.example.Model.Customer;
import org.example.Model.ParkingSpot;
import org.example.Model.Reservation;

import java.util.ArrayList;

public interface ReservationDao {
    Reservation findById(String id);
    Reservation saveReservation(Reservation reservation);
    Reservation vacateParkingSpot(Reservation reservation);
    ArrayList<Reservation> showOngoingReservations();
}
