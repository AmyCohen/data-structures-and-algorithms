package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShiftTest {

    @Test
    void shortExampleProvided() {
        int[] practiceArray = {2, 4, 6, 8};
        int[] practiceAdd = {5};
        int[] actual = ArrayShift.insertShiftArray(practiceArray, practiceAdd);

        int[] expected = {2,4,5,6,8};

        assertArrayEquals(expected, actual);
    }

    @Test
    void mediumExampleProvided() {
        int[] practiceArray = {4,8,15,23,42};
        int[] practiceAdd = {16};
        int[] actual = ArrayShift.insertShiftArray(practiceArray, practiceAdd);

        int[] expected = {4,8,15,16,23,42};

        assertArrayEquals(expected, actual);
    }

    @Test
    void longOriginalTestArray() {
        int[] practiceArray = {1, 2, 4,8,15,23,42, 100, 33};
        int[] practiceAdd = {18};
        int[] actual = ArrayShift.insertShiftArray(practiceArray, practiceAdd);

        int[] expected = {1, 2, 4,8,15, 18, 23,42, 100, 33};

        assertArrayEquals(expected, actual);
    }

    @Test
    void emptyArrayTestWithValue() {
        int[] practiceArray = {};
        int[] practiceAdd = {18};
        int[] actual = ArrayShift.insertShiftArray(practiceArray, practiceAdd);

        int[] expected = {18};

        assertArrayEquals(expected, actual);
    }

}