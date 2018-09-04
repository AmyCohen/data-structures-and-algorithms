package day37;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static int dynamicArraySizeAdjuster = 1_000_000;
    public static void main(String[] args) {
        double[] arrayOne = randomN(dynamicArraySizeAdjuster);
        double[] arrayTwo = arrayOne;
        selectionSort(arrayOne);
        MergeSort.mergeSort(arrayTwo);

    }

    public static double[] randomN(int size) {
        double[] randomSizedArray = new double[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {
        double dd = r.nextDouble();
            randomSizedArray[i] = dd;
        }

//        System.out.println("\n random array = " + Arrays.toString(randomSizedArray) + "\n");
        return randomSizedArray;
    }

    public static double[] copyRandomizedArray(double[] copiedArray) {
        double[] toCopy = copiedArray;
        return toCopy;
    }

    //taken from https://www.geeksforgeeks.org/selection-sort/
    public static double[] selectionSort (double[] arr) {
        int size = arr.length;
        long start = System.currentTimeMillis();
        //moving the boundary of the sorted array
        for (int i = 0; i < size-1; i++) {

            int minIndex = i;

            for (int j = i+1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            // Swap the found minimum element with the first element
            //hold reference to the minIndex value in the temp variable
            double temp = arr[minIndex];

            //change the value at the minIndex place in the array to the value that is in the arr at i. This could be the same value it already was or the new value that j gave it in the inner for loop.
            arr[minIndex] = arr[i];

            //change the array at the actual index to the temp value
            arr[i] = temp;
            }
        }

        System.out.println("Selection Sort");
//        System.out.println("Selection Sort = " + Arrays.toString(arr));
        System.out.println("array size = " + arr.length);
        long delta = System.currentTimeMillis() - start;
        System.out.println("milliseconds = " + delta + "\n");
        return arr;
    }
}
