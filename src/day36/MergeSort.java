package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] unsorted = new int[]{34, 19, 42, -9, 2018, 0, 2005, 77, 2099};

//        ArrayList<Integer> unsorted = new ArrayList<>();
//        unsorted.add(34);
//        unsorted.add(19);
//        unsorted.add(42);
//        unsorted.add(-9);
//        unsorted.add(2018);
//        unsorted.add(0);
//        unsorted.add(2005);
//        unsorted.add(77);
//        unsorted.add(2099);

        System.out.println(Arrays.toString(unsorted));

        mergeSort(unsorted);
    }
/*
https://www.geeksforgeeks.org/merge-sort/
sadly unhelpful

Travis's code from code review. VERY HELPFUL and fulfilled the whiteboard requirements since it only took in an array.  However, it didn't acutally solve the problem, so I couldn't use it.

Steve's solution from lecture.
 */
    public static int[] mergeSort(int[] unsorted) {

//        int size = unsorted.length;
//        int[] result = new int[size];
//        int half = (int) Math.floor(size / 2);

        //If the array is less than 2 (meaning 1 or 0, then it is by default already sorted and an just be returned.
        if (unsorted.length < 2) {
            return unsorted;
        }

        //put the left side of the original array here using the size divided by 2 to create the size of the new leftSide array.
//        int[] leftSide = new int[half];

        //while the leftSide array will always be the floored version of half, the rightSide array has to account for the fact that the original array may not have been even. So it rounds up to the number that is the original size divided by 2.
//        int[] rightSide = new int[(int) Math.ceil((double) size / 2)];

//        int[] leftSide = leftSide(unsorted);
//        int[] rightSide = rightSide(unsorted);

        int[] leftSide = unsorted;
        int[] rightSide = unsorted;

//        for (int i = 0; i < half; i++) {
//            //populate the left side array by counting up from index 0
//            leftSide[i] = unsorted[i];
//            //populate the right side of the array by counting up from the halfway point from the original array
//            rightSide[i] = unsorted[half + i];
//        }

        //the above would only work on an even original array. This if takes into consideration that the original array may have been odd and then adds the last number into the right side array. This also avoid null pointer exceptions from trying to do this above.
//        if (size % 2 == 1) {
//            rightSide[half] = unsorted[size - 1];
//        }

        //recursively call the function on each side to continue to split the arrays into smaller portions.
        leftSide = mergeSort(leftSide);
        rightSide = mergeSort(rightSide);

        //set the return value to be the answer from the helperfuntion called "stitch"
        int[] result = merge(leftSide, rightSide);
        return result;
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

//        for (int i = 0; i < size; i++) {
//            if ((rightIndex == right.length) || (leftIndex != left.length && left[leftIndex] < right[rightIndex])) {
//                result[i] = left[leftIndex];
//                leftIndex++;
//            } else {
//                result[i] = right[rightIndex];
//                rightIndex++;
//            }
//        }
        return result;
    }
}