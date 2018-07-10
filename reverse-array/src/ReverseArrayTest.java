import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseArrayTest {
    @Test

    public void reverseArrayTest() {
        int[] numbers = ReverseArray.reverseArray();

        int[] expected = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, numbers);

    }
}


/*
FROM EXAMPLE:
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class D01_ArrayReverseTest {
    @Test
    public void myTest() {
        int[] numbers = {1, 2, 3};
        D01_ArrayReverse.doubler(numbers);
        int[] expected = {2, 4, 6};
        assertArrayEquals(numbers, expected);
    }
}
*** PASSED ***
 */