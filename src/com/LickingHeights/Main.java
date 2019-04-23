package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int easterEggCountdown = 3;
        Scanner userInput;
        String ynResponse;
        userInput = new Scanner(System.in);
        boolean mainLoop = true;
        while (mainLoop == true) {
            System.out.println("do you want to try again? y/n\n(single letter response please)");
            ynResponse = userInput.next();
            if (ynResponse.equalsIgnoreCase("y")) {
                System.out.println("hi");
                boolean secondaryLoop = true;
                while (secondaryLoop == true) {

                }


                easterEggCountdown =easterEggCountdown-1;
            }
            else if (ynResponse.equalsIgnoreCase("n")) {
                System.out.println("Goodbye then");
                mainLoop = false;
            }




        }
    }
}