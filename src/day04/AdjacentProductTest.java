package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacentProductTest {

    @Test
    void smallArrayTest() {

        int[][] array = {
                {1, 2, 1},
                {2, 4, 2},
                {3, 6, 8},
                {7, 8, 1}
        };

        int actual = AdjacentProduct.largestProduct(array);
        int expected = 64;

        assertEquals(expected, actual);
    }

    @Test
    void largeArrayTest() {

        int[][] array = {
                {1, 2, 4, 6, 8},
                {2, 3, 7, 9, 9},
                {14, 16, 18, 70, 21},
                {20,99,37,46, 52},
                {99,22,3,10,11},
                {19,13,5,88,77},
        };

        int actual = AdjacentProduct.largestProduct(array);
        int expected = 9801;

        assertEquals(expected, actual);
    }

    @Test
    void emptyArrayTest() {

        int[][] array = {};

        int actual = AdjacentProduct.largestProduct(array);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void unEvenArrayTest() {

        int[][] array = {
            {1},
            {2, 3, 7, 9, 9},
            {14, 16, 18, 70},
            {20,99,37,46, 52},
            {99,22,3},
            {19,13,5,88,77},
        };

        int actual = AdjacentProduct.largestProduct(array);
        int expected = 9801;

        assertEquals(expected, actual);
    }
}