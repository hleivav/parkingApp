package org.example.DAO;

import org.example.Model.Reservation;

import java.util.ArrayList;

public interface ReservationDao {
    Reservation saveReservation();
    Reservation vacateParkingSpot();
    ArrayList<Reservation> showOngoingReservations();
}
