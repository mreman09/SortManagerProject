package com.sparta.reman.controller;

import com.sparta.reman.view.Printer;
import com.sparta.reman.sort.*;

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
        if(SortManager.sortAlgorithm.equals("bubble")){
            System.out.println("time taken in ms to execute bubble algorithm: ");
            System.out.println((BubbleSort.endTime - BubbleSort.startTime));
        } else {
            System.out.println("time in ms taken to execute Merge algorithm: ");
            System.out.println((MergeSort.endTime - MergeSort.startTime)/1000000);
        }



    }

    public static void showArray(int[] showNewArray, boolean sorted) {
        if (sorted == false) {
            Printer.printString("The random generated array is the following: ");
            Printer.printIntArray(showNewArray);
        } else {
            Printer.printString("The sorted array is the following: ");
            Printer.printIntArray(showNewArray);
        }
    }

}
