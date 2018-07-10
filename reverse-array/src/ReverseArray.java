public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        reverseArray(numbers);
    }

    public static void reverseArray(int[] numbers) {
        int[] reversedNumbers = new int[numbers.length];
        int index = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Numbers at i: " + numbers[i]);
            System.out.println("Reversed Numbers at i: " + reversedNumbers[i]);
            System.out.println("Reversed Numbers at index: " + reversedNumbers[index]);

            reversedNumbers[index++] = numbers[i];
//            System.out.println(reversedNumbers[index++] = numbers[i]);
        }
    }
}

/*
public class D01_ArrayReverse {
    public static void main(String[] args) {
        int[] awesomeArray = {1, 2, 3, 4, 5};
        doubler(awesomeArray);
    }
    public  static void doubler (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
}
 */