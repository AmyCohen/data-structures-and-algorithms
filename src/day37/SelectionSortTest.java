package day37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void selectionSort() {

        int actual = SelectionSort.selectionSort(SelectionSort.randomN(10_000)).length;
        int expected = 10_000;
        assertEquals(expected, actual);
    }
    @Test
    void selectionSortIsSorted() {
        Boolean isSorted = false;
        double[] copy = SelectionSort.selectionSort(SelectionSort.randomN(10_000));

        for (int i = 0; i < copy.length-1; i++){
            if (i < i+1) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }

        Boolean actual = isSorted;
        Boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void selectionSortOfZero() {
        Boolean isSorted = false;
        double[] copy = SelectionSort.selectionSort(SelectionSort.randomN(0));

        if (copy.length == 0) {
            isSorted = true;
        }
        for (int i = 0; i < copy.length-1; i++){
            if (i < i+1) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }

        Boolean actual = isSorted;
        Boolean expected = true;
        assertEquals(expected, actual);
    }

}