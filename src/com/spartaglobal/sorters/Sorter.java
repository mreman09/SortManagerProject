package com.spartaglobal.sorters;

import com.spartaglobal.sorters.BubbleClass;
import com.spartaglobal.sorters.MergeSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("give a number of items for an array");
        int response = scan.nextInt();
        int[] numbers = new int[response];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("1 or 2");
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println(Arrays.toString(numbers));
            BubbleClass test = new BubbleClass();
            test.bubbleSort(numbers);
            System.out.println(Arrays.toString(numbers));
        }else if(option == 2){
            System.out.println(Arrays.toString(numbers));
            MergeSort test2 = new MergeSort();
            test2.mergesSort(numbers);
            System.out.println(Arrays.toString(numbers));
        }else {
            System.out.println("pick a valid option");
        }
    }
}
