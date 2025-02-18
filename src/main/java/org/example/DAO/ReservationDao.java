package org.example.DAO;

import org.example.Model.Customer;
import org.example.Model.ParkingSpot;
import org.example.Model.Reservation;

import java.util.ArrayList;

public interface ReservationDao {
    Reservation saveReservation(Reservation reservation);
    Reservation vacateParkingSpot();
    ArrayList<Reservation> showOngoingReservations();
}
