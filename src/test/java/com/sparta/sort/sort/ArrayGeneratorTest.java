package com.sparta.sort.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.sparta.sort.sort.ArrayGenerator;

import static org.junit.jupiter.api.Assertions.*;

class ArrayGeneratorTest {

    @Test
    void generateIntArray() {
        int[] test = ArrayGenerator.generateIntArray(100);
        int size = 100;
        int compare = test.length;
        Assertions.assertEquals(size, compare);
    }


}