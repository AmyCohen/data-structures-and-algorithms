package day02;


import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
//        int[] practiceArray = {2, 4, 6, 8};
//        int[] practiceAdd = {5};

//        int[] practiceArray = {4,8,15,23,42};
//        int[] practiceAdd = {16};

        int[] practiceArray = {1, 2, 4,8,15,23,42, 100, 33};
        int[] practiceAdd = {18};


        insertShiftArray(practiceArray, practiceAdd);
    }

    public static int[] insertShiftArray(int[] numbersArray, int[] addNumber) {
        int[] newNumbersArray = new int[numbersArray.length + 1];
        double findingHalf = (double)numbersArray.length/2;

        double halfOfArray = Math.ceil(findingHalf);

        for (int i = 0; i < newNumbersArray.length; i++) {
            if (i < halfOfArray) {
                newNumbersArray[i] = numbersArray[i];
            } else if (i == halfOfArray) {
                newNumbersArray[i] = addNumber[0];
            } else if (i > halfOfArray) {
                newNumbersArray[i] = numbersArray[i - 1];
            }
        }
        System.out.println(Arrays.toString(newNumbersArray));
        return newNumbersArray;
    }
}






