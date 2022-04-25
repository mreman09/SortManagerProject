package com.sparta.exceptions;

import com.sparta.logging.LoggingClass;

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
                LoggingClass.logger.error("User did not enter a number ");
                System.out.println("\nInput mismatch exception occurred, you've entered something unexpected\nTry entering a number mate");
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
                    LoggingClass.logger.error("User entered: " + "'"+sortAlgorithm+"'" + " instead of Bubble || Merge");
                    System.out.println("Input must be Bubble or Merge (Caps does not matter) you have entered " + sortAlgorithm + "\nTry Bubble" );
                }
            } catch (InputMismatchException e) {
                LoggingClass.logger.error("User did not type Bubble || Merge: ", e);
                System.out.println("\nInput Mismatch Exception has occurred ");
            }
        }
    }
}
