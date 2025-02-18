package org.example.View;

import org.example.DAO.CustomerDaoList;
import org.example.Model.Customer;
import org.example.Model.Vehicle;
import org.example.Model.VehicleSort;

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

                break;
            case "3":
                Customer customerToSave = CustomerDaoList.getInstance().findById(ui.catchUserInput("Enter the customerNo: ", "Your choice cant't be empty"));
                if (customerToSave != null){//todo: search for the costumer first. We're just looking if the string is not empty.

                    System.out.println(CustomerDaoList.getInstance().registerCustomer(customerToSave).toString());
                } else {
                    System.out.println("The customer couldn't be found");
                }
                break;
            case "4":
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
        String car = ui.catchUserInput("Enter the plate number of the vehicle: ", "The plate number can't be empty");
        VehicleSort vehicleSort = ui.catchUserInputWithEnum("Chose the vehicle sort: ");
        Vehicle vehicle = new Vehicle("MDK282", vehicleSort);
        Customer customer = new Customer(name, phone, vehicle);
        System.out.println("The customer has successfully been registered");
        System.out.println(CustomerDaoList.getInstance().registerCustomer(customer));
    }

}
