package com.sparta.sort.view;

import com.sparta.logging.LoggingClass;
import com.sparta.exceptions.SortManager;
import com.sparta.sort.sort.BubbleSort;
import com.sparta.sort.sort.MergeSort;

import java.util.Arrays;
public class Printer {
    public static void printString(String message) {
        System.out.println(message);
    }
    public static void printString() {
        System.out.println();
    }

    public static void printIntArray(int[] numberArray) {
        System.out.println(Arrays.toString(numberArray));
    }

    public static void printErrorMessage(String message) {
        System.err.println(message);
    }

    public static void printInt(int number) {
        System.out.println(number);
    }

    public static void printPerformanceTestString(String message, long time) {
        System.out.printf(message, time);
    }

    public static void logForTime(Long time, String type, String scale){
        LoggingClass.logger.info("Time Taken to execute the "+ type + ":" + time + scale);
    }

    public static void timeTaken(String type){
        if(SortManager.sortAlgorithm.equals("bubble")){
            long time = (BubbleSort.endTime - BubbleSort.startTime) / 1000000;
            long time1 = BubbleSort.endTime - BubbleSort.startTime;
            if (time > 0) {
                System.out.println("\nTime taken to execute the Bubble algorithm: " + time + "ms");
                logForTime(time, "Bubble algorithm", "ms");
            } else {
                System.out.println("\nTime taken to execute the Bubble algorithm: " + time1 + " nano seconds");
                logForTime(time1, "Bubble algorithm", " nano seconds");
            }
        } else {
            long time = (MergeSort.endTime - MergeSort.startTime) / 1000000;
            long time1 = MergeSort.endTime - MergeSort.startTime;
            if (time > 0) {
                logForTime(time, "Merge algorithm", "ms");
                System.out.println("\nTime taken to execute the Merge algorithm: " + time + "ms");
            } else {
                logForTime(time1, "Merge algorithm", " nano seconds");
                System.out.println("\nTime taken to execute the Merge algorithm: " + time1 + " nano seconds");
            }
        }
    }


}
