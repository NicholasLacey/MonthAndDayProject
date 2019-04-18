package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput;
        String ynResponseStringType;
        userInput = new Scanner(System.in);
        boolean mainLoop = true;
        while (mainLoop == true) {
            System.out.println("do you want to try again?");
            ynResponseStringType = userInput.next();
            if (ynResponseStringType.equalsIgnoreCase("y")) {}
            else if (ynResponseStringType.equalsIgnoreCase("n")) {
                System.out.println("Goodbye then");
                mainLoop = false;
            }




        }
    }
}
