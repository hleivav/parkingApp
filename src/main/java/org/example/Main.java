package org.example;

import org.example.View.UIController;

public class Main {
    public static void main(String[] args) {

        Populator.populator();

        UIController uiController = new UIController();
        uiController.start();
    }


}