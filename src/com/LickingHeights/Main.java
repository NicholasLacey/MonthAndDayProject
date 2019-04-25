package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int easterEggCountdown = 6;
        Scanner userInput;
        String ynResponse;
        userInput = new Scanner(System.in);
        boolean mainLoop = true;
        while (mainLoop == true) {
            System.out.println("do you want to try again? y/n\n(single letter response please)");
            ynResponse = userInput.next();
            if (ynResponse.equalsIgnoreCase("y")) {
                easterEggCountdown -= 0.5;
                boolean secondaryLoop = true;
                while (secondaryLoop == true) {
                System.out.println("Monday's child is fair of face,\n" +
                        "Tuesday's child is full of grace,\n" +
                        "Wednesday's child is full of woe,\n" +
                        "Thursday's child has far to go.\n" +
                        "Friday's child is loving and giving,\n" +
                        "Saturday's child works hard for a living,\n" +
                        "But the child born on the Sabbath Day,\n" +
                        "Is fair and wise and good in every way.\n\n to find out what you are please\ntype your b" +
                        "irth year"+easterEggCountdown);
                int year = userInput.nextInt();
                System.out.println("now your birth month");
                int month = userInput.nextInt();
                System.out.println("now your birth day");
                int day = userInput.nextInt();
                    secondaryLoop = false;
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