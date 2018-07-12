package day03;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {4,8,15,16,23,42};
//        int[] array = {11,22,33,44,55,66,77};

        int key = 15;
//        int key = 90;
        binarySearch(array, key);

    }

    public static int binarySearch (int[] sortedArray, int searchKey) {
        int left = 0;
        int right = sortedArray.length - 1;
        int middleOfArray = (int) Math.floor((left + right) / 2);
        int unsuccessful = -1;


        for (int i = left; i < right; i++) {
//            middleOfArray = (int) Math.floor((left + right) / 2);

            if (left > right) {
                System.out.println(unsuccessful);
                return unsuccessful;
            }

            if (sortedArray[middleOfArray] < searchKey) {
                left = middleOfArray + 1;
                middleOfArray = (int) Math.floor((left + right) / 2);;
            }
            if (sortedArray[middleOfArray] > searchKey) {
                right = middleOfArray - 1;
            }
            if (sortedArray[middleOfArray] == searchKey) {
                System.out.println(middleOfArray);
                return middleOfArray;
            }
        }
        System.out.println(middleOfArray);
        return middleOfArray;
    }
//            if(sortedArray.equals(searchKey)) {
//                indexOfKey = sortedArray[i];
//            }
//            System.out.println("this didn't work");
//        }
    }

