package com.spartaglobal.sorters;

import java.util.Arrays;
import java.util.Random;


public class ArrayGenerator {
    Random rand = new Random();

    public int[] generator(int x){
        int[] numbers = new int[x];
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = rand.nextInt(100000);
        }
        return numbers;
    }
}
