package com.sparta.sort.sort;

import java.util.Random;

public class ArrayGenerator {

    public static int[] generateIntArray(int length) {
        return generateIntArray(length, -1000, 1000);
    }

    public static int[] generateIntArray(int length, int lowest, int highest) {
        int[] generatedArray = new int[length];
      //  LoggingClass.logger.info("Length of array chosen by user was: " + String.valueOf(SortManager.inputLength));

        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = new Random().nextInt(highest - lowest + 1) + lowest;
        }
        return generatedArray;
    }


}
