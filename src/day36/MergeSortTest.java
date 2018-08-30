package day36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void EmptyArray() {
        int[] unsorted = new int[]{};
        int[] sorted = new int[]{};
        String actual = Arrays.toString(MergeSort.mergeSort(unsorted));
        String expected = Arrays.toString(sorted);

        assertEquals(expected, actual);
    }
    @Test
    void mergeSortOddNumArray() {
        int[] unsorted = new int[]{34, 19, 42, -9, 2018, 0, 2005, 77, 2099};
        int[] sorted = new int[]{-9, 0, 19, 34, 42, 77, 2005, 2018, 2099};
        String actual = Arrays.toString(MergeSort.mergeSort(unsorted));
        String expected = Arrays.toString(sorted);

        assertEquals(expected, actual);
    }

    @Test
    void mergeSortEvenNumArray() {
        int[] unsorted = new int[]{34, 19, 42, -9, 2018, 2005, 77, 2099};
        int[] sorted = new int[]{-9, 19, 34, 42, 77, 2005, 2018, 2099};
        String actual = Arrays.toString(MergeSort.mergeSort(unsorted));
        String expected = Arrays.toString(sorted);

        assertEquals(expected, actual);
    }

    @Test
    void mergeSortSmallEvenNumArray() {
        int[] unsorted = new int[]{34, 19};
        int[] sorted = new int[]{19, 34};
        String actual = Arrays.toString(MergeSort.mergeSort(unsorted));
        String expected = Arrays.toString(sorted);

        assertEquals(expected, actual);
    }

    @Test
    void mergeSortSmallOddNumArray() {
        int[] unsorted = new int[]{34, 19, -99};
        int[] sorted = new int[]{-99, 19, 34};
        String actual = Arrays.toString(MergeSort.mergeSort(unsorted));
        String expected = Arrays.toString(sorted);

        assertEquals(expected, actual);
    }

    @Test
    void rightSideOdd5() {
        int[] unsorted = new int[]{34, 19, 42, -9, 2018, 0, 2005, 77, 2099};
        String actual = Arrays.toString(MergeSort.rightSide(unsorted));
        String expected = "[2018, 0, 2005, 77, 2099]";

        assertEquals(expected, actual);
    }

    @Test
    void rightSideEven4() {
        int[] unsorted = new int[]{34, 19, 42, -9, 2018, 2005, 77, 2099};
        String actual = Arrays.toString(MergeSort.rightSide(unsorted));
        String expected = "[2018, 2005, 77, 2099]";

        assertEquals(expected, actual);
    }

    @Test
    void rightSideOdd3() {
        int[] unsorted = new int[]{34, 19, 42};
        String actual = Arrays.toString(MergeSort.rightSide(unsorted));
        String expected = "[19, 42]";

        assertEquals(expected, actual);
    }

    @Test
    void leftSideAlwaysEven4() {
        int[] unsorted = new int[]{34, 19, 42, -9, 2018, 0, 2005, 77, 2099};
        String actual = Arrays.toString(MergeSort.leftSide(unsorted));
        String expected = "[34, 19, 42, -9]";

        assertEquals(expected, actual);
    }

    @Test
    void rightSideSmallEven4() {
        int[] unsorted = new int[]{34, 19, 42, 99};
        String actual = Arrays.toString(MergeSort.leftSide(unsorted));
        String expected = "[34, 19]";

        assertEquals(expected, actual);
    }
}