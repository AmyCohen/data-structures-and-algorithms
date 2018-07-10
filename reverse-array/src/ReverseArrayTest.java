import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseArrayTest {
    @Test

    public void reverseArrayTest() {
        int[] numbers = ReverseArray.reverseArray();

//        int[] expected = {6, 5, 4, 3, 2, 1};
//        int[] expected = {-12, 823, -923, 10, 23, 3546, 2354, 89};
        int[] expected = {199, 197, 193, 191, 181, 179, 173, 167, 163, 157, 151, 149, 139, 137, 131, 127, 113, 109, 107, 103, 101, 97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2};

        assertArrayEquals(expected, numbers);

    }
}