package day36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @BeforeEach
    void setUp() {
        int[] unsorted = new int[]{34, 19, 42, -9, 2018, 0, 2005, 77, 2099};
    }

    @Test
    void mergeSortNormalTest() {
        int[] unsorted = new int[]{34, 19, 42, -9, 2018, 0, 2005, 77, 2099};
        int[] sorted = new int[]{-9, 0, 19, 34, 42, 77, 2005, 2018, 2099};
        String actual = Arrays.toString(MergeSort.mergeSort(unsorted));
        String expected = Arrays.toString(sorted);

        assertEquals(expected, actual);
    }
//
//    @Test
//    void rightSide() {
//    }
//
//    @Test
//    void leftSide() {
//    }
}