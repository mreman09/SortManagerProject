package com.sparta.reman.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortManager {

    public static int inputLength = 0;
    public static String sortAlgorithm = "";

    public static int length() {

        boolean validInput = false;

        while (validInput == false) {
            Scanner myObject = new Scanner(System.in);
            try {
                inputLength = myObject.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch Exception has occurred you've entered a " + e.getMessage() + " value\nTry entering a number mate");
            }
        } return inputLength;
    }
    public static void sorting(){
        boolean validInput = false;

        while(validInput == false) {
            Scanner myObject = new Scanner(System.in);
            try {
                sortAlgorithm = myObject.nextLine();
                sortAlgorithm = sortAlgorithm.toLowerCase();
                if (sortAlgorithm.equals("bubble") || sortAlgorithm.equals("merge")){
                    validInput = true;
                } else{
                    validInput = false;
                    System.out.println("Input must be Bubble or Merge (Caps does not matter) you have entered " + sortAlgorithm + "\nTry Bubble" );
                }
            } catch (InputMismatchException msg) {
                System.out.println("Input Mismatch Exception has occurred " + msg.getMessage());
            }
        }
    }
}
