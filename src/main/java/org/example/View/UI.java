package org.example.View;

import org.example.Model.VehicleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    Scanner scanner = new Scanner(System.in);

    // ANSI escape-codes for colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public void showMenu(){
        System.out.println(ANSI_YELLOW);
        System.out.println(ANSI_YELLOW + "1 - Register Customer");
        System.out.println("2 - Display available parking spots");
        System.out.println("3 - Park vehicle");
        System.out.println("4 - Vacate parking spot");
        System.out.println("0 - Exit" + ANSI_RESET);
        System.out.println(ANSI_RESET);
    }

    public String catchUserInput (String question, String errorMessage){
        while (true){
            System.out.println(ANSI_YELLOW + question + ANSI_RESET);
            String userAnswer = scanner.nextLine();
            if (userAnswer != null && !userAnswer.trim().isEmpty()){
                return userAnswer;
            }
            System.out.println(ANSI_RED + "Your choice can't be empty." + ANSI_RESET);
        }
    }

    public VehicleSort catchUserInputWithEnum (String message){
        int counter = 1;
        VehicleSort userAnswer;
        VehicleSort[] vs = VehicleSort.values();
        System.out.println(message);
        for (VehicleSort element : VehicleSort.values()){
            System.out.println(counter + " - " + element.toString());
            counter++;
        }
        int userChoice = Integer.parseInt(scanner.nextLine());
        return vs[userChoice - 1];
    }

}
