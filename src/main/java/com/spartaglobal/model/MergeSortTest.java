package com.spartaglobal.model;

import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    void mergesSort() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergesSort(actual);
        // assertArrayEquals(expected);
    }

    @Test
    void merge() {
    }
}