package org.example.View;

import org.example.DAO.CustomerDaoList;
import org.example.DAO.ParkingSpotDaoList;
import org.example.DAO.ReservationDaoList;
import org.example.Model.*;

import java.util.ArrayList;

public class UIController {

    UI ui = new UI();
    boolean done = false;

    public void start(){
        while (!done){
            ui.showMenu();
            handleMenuChoices(ui.catchUserInput("Make a choice from the menu", "Your choice can't be emtpy. "));
        }
    }

    public void handleMenuChoices(String userChoice){
        switch (userChoice){
            case "1":
                handleRegisterCustomerChoice();
                break;
            case "2":
                handleAvailableParkingSpotsChoice();
                break;
            case "3":
                handleParkVehicleChoice();
                break;
            case "4":
                handleVacateVehicleChoice();
                break;
            case "0":
                done = true;
            default:
                System.out.println("Chose one of the options from the menu");
        }


    }

    public void handleRegisterCustomerChoice(){
        String name = ui.catchUserInput("Enter the customer's name: ", "The name can't be empty");
        String phone = ui.catchUserInput("Enter the customer's phone: ", "The phone can't be empty");
        String plateNo = ui.catchUserInput("Enter the plate number of the vehicle: ", "The plate number can't be empty");
        VehicleSort vehicleSort = ui.catchUserInputWithEnum("Chose the vehicle sort: ");
        Vehicle vehicle = new Vehicle(plateNo, vehicleSort);
        Customer customer = new Customer(name, phone, vehicle);
        System.out.println("The customer has successfully been registered");
        System.out.println(CustomerDaoList.getInstance().registerCustomer(customer));
    }

    public void handleParkVehicleChoice(){
        String id = ui.catchUserInput("Enter the customer id: ", "You must enter a valid id. ");
        Customer customer = CustomerDaoList.getInstance().findById(id);
        if (customer != null) {
            if (CustomerDaoList.getInstance().findById(id) != null){
                ParkingSpot parkingSpot = ParkingSpotDaoList.getInstance().searchFirstAvailableParkingSpotFromASort(customer.getVehicle().getVehicleSort());
                if (parkingSpot != null){
                    System.out.println(parkingSpot);
                    Reservation reservation = new Reservation(customer, parkingSpot);
                    ReservationDaoList.getInstance().saveReservation(reservation);
                    parkingSpot.setOccupied(true);
                    System.out.println("The reservation has bee made.");
                    System.out.println(reservation.toString());
                }
            } else {
                System.out.println("That customer has already a vehicle parked.");
            }
        } else {
            System.out.println("We couldn't found a customer with that customer id.");
        }
    }

    public void handleAvailableParkingSpotsChoice(){
        ArrayList<ParkingSpot>AvailableParkingSpots = ParkingSpotDaoList.getInstance().searchAllParkingSpots();
        for (ParkingSpot element : AvailableParkingSpots){
            System.out.println(element.toString());
        }
    }

    public void handleVacateVehicleChoice(){

        String id = ui.catchUserInput("Enter the reservation id: ", "You must enter a valid id. ");
        Reservation reservation = ReservationDaoList.getInstance().findById(id);
        if (reservation != null) {
            if (reservation.getActive()){
                ReservationDaoList.getInstance().vacateParkingSpot(reservation);
            } else {
                System.out.println("That reservation has already expired. ");
            }
        } else {
            System.out.println("We couldn't found a customer with that customer id.");
        }

    }


}
