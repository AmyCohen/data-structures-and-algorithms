package day37;

import java.util.Arrays;

public class MergeSort {
//    public static void main(String[] args) {
//        double[] unsorted = new double[]{34, 19, 42, -9, 2018, 0, 2005, 77, 2099};
//        mergeSort(unsorted);
//    }

    public static int dynamicArraySizeAdjuster = SelectionSort.dynamicArraySizeAdjuster;
/*
https://www.geeksforgeeks.org/merge-sort/
sadly unhelpful

Travis's code from code review. VERY HELPFUL and fulfilled the whiteboard requirements since it only took in an array.  However, it didn't acutally solve the problem, so I couldn't use it.

Steve's solution from lecture.
 */
    public static double[] mergeSort(double[] unsorted) {
        long start = System.currentTimeMillis();

        //If the array is less than 2 (meaning 1 or 0, then it is by default already sorted and an just be returned.
        if (unsorted.length < 2 || unsorted.length == 0) {
            return unsorted;
        }

        double[] leftSide = leftSide(unsorted);
        double[] rightSide = rightSide(unsorted);

        //recursively call the function on each side to continue to split the arrays into smaller portions.
        leftSide = mergeSort(leftSide);
        rightSide = mergeSort(rightSide);

        //set the return value to be the answer from the helperfuntion called merge
        double[] result = merge(leftSide, rightSide);

        if (result.length == dynamicArraySizeAdjuster) {
            System.out.println("Merge Sort");
//            System.out.println("Merge Sort = " + Arrays.toString(result));
            System.out.println("array size = " + result.length);

            long delta = System.currentTimeMillis() - start;

            System.out.println("milliseconds = " + delta + "\n");
        }
        return result;
    }

    public static double[] rightSide(double[] unsortedArray) {
        double sizeOfUnsortedArray = unsortedArray.length;

        if (sizeOfUnsortedArray < 2) {
            return unsortedArray;
        }

        double lengthOfNewArray;
        double halfOfUnsortedArray = sizeOfUnsortedArray/2;
        if (halfOfUnsortedArray == 1) {
            lengthOfNewArray = 1;
        } else if (halfOfUnsortedArray % 2 == 0 || sizeOfUnsortedArray % 2 == 0) {
            lengthOfNewArray = halfOfUnsortedArray;
        } else {
            lengthOfNewArray = Math.floor(halfOfUnsortedArray+1);
        }

        double[] right = new double[(int) lengthOfNewArray];

        double index;
        if (lengthOfNewArray == 1 || halfOfUnsortedArray == 1.5) {
            index = 1;
        } else if (lengthOfNewArray % 2 == 0 || sizeOfUnsortedArray % 2 == 0) {
            index = lengthOfNewArray;
        } else {
            index = lengthOfNewArray - 1;
        }

        int counter = 0;
        for (int i = (int) index; i < unsortedArray.length; i++){
            right[counter] = unsortedArray[i];
            if (unsortedArray.length > 2) {
                counter++;
            }
        }
        return right;
    }

    public static double[] leftSide(double[] unsorted) {
        int half;

        if (unsorted.length < 2) {
            return unsorted;
        }

        half = (int) Math.floor(unsorted.length / 2);


        double[] left = new double[half];

        for (int i = 0; i < half; i++){
            left[i] = unsorted[i];
        }
        return left;
    }

    private static double[] merge (double[] left, double[] right) {
        //get the size of the entire array by adding up both the left and right sides
        int size = left.length + right.length;

        //create a new array to hold the zipped up arrays
        double[] result = new double[size];

        //create to pointers
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                result[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
            }
        }

        while (rightIndex < right.length) {
            result[leftIndex + rightIndex] = right[rightIndex];
            rightIndex++;
        }

        while (leftIndex < left.length) {
            result[leftIndex + rightIndex] = left[leftIndex];
            leftIndex++;
        }

        return result;
    }
}