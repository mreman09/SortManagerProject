package com.sparta.sort.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeArray() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeArray(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    void merge() {

    }
}