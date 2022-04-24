package com.sparta.sort.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {



    @Test
    void sortArray() {
        int[] testArray = {5,9,10,3,2,1};
        BubbleSort sorter = new BubbleSort();
        sorter.sortArray(testArray);
        int[] expectedArray = {1,2,3,5,9,10};
        Assertions.assertArrayEquals(testArray, expectedArray);
    }
}