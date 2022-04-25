package com.sparta.sort.controller;

import com.sparta.exceptions.SortManager;
import com.sparta.logging.LoggingClass;
import com.sparta.sort.view.Printer;
import com.sparta.sort.sort.*;

public class DisplayManager {
    public static void start() {
        System.out.println("Welcome to Remans sort Manager. \n \nHow big would you like your array to be?");
        System.out.println("\n----------------------------------------------------- \nAn array has been generated containg "+ SortManager.length() + " numbers"+ "\n-----------------------------------------------------\n \n \nSelect the type of the sorting algorithm you would like applied to it: \n \t 1:Bubble  \n \t 2:Merge \nType the option and press enter");
        SortManager.sorting();

        int[] newArray = ArrayGenerator.generateIntArray(SortManager.inputLength);
        DisplayManager.showArray(newArray, false);
        Sorter sorter = SortFactory.getSort(SortManager.sortAlgorithm);
        sorter.sortArray(newArray);
        DisplayManager.showArray(newArray, true);
        Printer.timeTaken(SortManager.sortAlgorithm);




    }

    public static void showArray(int[] showNewArray, boolean sorted) {
        if (sorted == false) {
            Printer.printString("\nRandom array: ");
            Printer.printIntArray(showNewArray);
        } else {
            Printer.printString("\nSorted array: ");
            Printer.printIntArray(showNewArray);
            System.out.println("");
            LoggingClass.logger.info("Length of array chosen by user was: " + String.valueOf(SortManager.inputLength));
        }
    }

}
