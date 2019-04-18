package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int easterEggCountdowm = 3;
        Scanner userInput;
        String ynResponse;
        userInput = new Scanner(System.in);
        boolean mainLoop = true;
        while (mainLoop == true) {
            System.out.println("do you want to try again?");
            ynResponse = userInput.next();
            if (ynResponse.equalsIgnoreCase("y")) {
                System.out.println("hi");



            }
            else if (ynResponse.equalsIgnoreCase("n")) {
                System.out.println("Goodbye then");
                mainLoop = false;
            }




        }
    }
}
