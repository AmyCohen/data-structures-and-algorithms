package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearchIncluded() {
        int[] array = {4,8,15,16,23,42};
        int key = 15;

        int actual = BinarySearch.binarySearch(array, key);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void binarySearchExcluded() {
        int[] array = {11,22,33,44,55,66,77};
        int key = 90;

        int actual = BinarySearch.binarySearch(array, key);
        int expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    void binarySearchEmptyArray() {
        int[] array = {};
        int key = 0;

        int actual = BinarySearch.binarySearch(array, key);
        int expected = -1;

        assertEquals(expected, actual);
    }
}
