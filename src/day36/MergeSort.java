package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] unsorted = new int[]{34, 19, 42, -9, 2018, 0, 2005, 77, 2099};

//        System.out.println(Arrays.toString(unsorted));

        mergeSort(unsorted);
    }
/*
https://www.geeksforgeeks.org/merge-sort/
sadly unhelpful

Travis's code from code review. VERY HELPFUL and fulfilled the whiteboard requirements since it only took in an array.  However, it didn't acutally solve the problem, so I couldn't use it.

Steve's solution from lecture.
 */
    public static int[] mergeSort(int[] unsorted) {

        //If the array is less than 2 (meaning 1 or 0, then it is by default already sorted and an just be returned.
        if (unsorted.length < 2 || unsorted.length == 0) {
            return unsorted;
        }

        int[] leftSide = leftSide(unsorted);
        int[] rightSide = rightSide(unsorted);

        //recursively call the function on each side to continue to split the arrays into smaller portions.
        leftSide = mergeSort(leftSide);
        rightSide = mergeSort(rightSide);

        //set the return value to be the answer from the helperfuntion called merge
        int[] result = merge(leftSide, rightSide);
        System.out.println("Result = " + Arrays.toString(result));
        return result;
    }

    public static int[] rightSide(int[] unsortedArray) {
        double sizeOfUnsortedArray = unsortedArray.length;

        if (sizeOfUnsortedArray < 2) {
            return unsortedArray;
        }

        double lengthOfNewArray;
        double halfOfUnsortedArray = sizeOfUnsortedArray/2;
        if (halfOfUnsortedArray == 1) {
            lengthOfNewArray = 1;
        } else if (halfOfUnsortedArray % 2 == 0) {
            lengthOfNewArray = halfOfUnsortedArray;
        } else {
            lengthOfNewArray = Math.floor(halfOfUnsortedArray+1);
        }

        int [] right = new int[(int) lengthOfNewArray];

        double index;
        if (lengthOfNewArray == 1 || halfOfUnsortedArray == 1.5) {
//        if (lengthOfNewArray <= 2) {
            index = 1;
        } else if (lengthOfNewArray % 2 == 0) {
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
        System.out.println("right array = " + Arrays.toString(right));
        return right;
    }

    public static int[] leftSide(int[] unsorted) {
        int half;

        if (unsorted.length < 2) {
            return unsorted;
        }

        half = (int) Math.floor(unsorted.length / 2);


        int[] left = new int[half];

        for (int i = 0; i < half; i++){
            left[i] = unsorted[i];
        }
        System.out.println("left array = " + Arrays.toString(left));
        return left;
    }

    private static int[] merge (int[] left, int[] right) {
        //get the size of the entire array by adding up both the left and right sides
        int size = left.length + right.length;

        //create a new array to hold the zipped up arrays
        int[] result = new int[size];

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