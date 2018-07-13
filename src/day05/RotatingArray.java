package day05;

import java.util.Arrays;

public class RotatingArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3},
        };
        turningArray90Degrees(array);
    }

    public static int[][] turningArray90Degrees(int[][] array) {
        int[][] swapped = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                swapped[col][2 - row] = array[row][col];
            }
        }
            System.out.println("Final " + Arrays.deepToString(swapped));
        return swapped;
    }
}








