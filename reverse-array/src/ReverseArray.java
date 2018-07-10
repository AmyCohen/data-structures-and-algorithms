public class ReverseArray {
    public static void main(String[] args) {
        reverseArray();
    }

    public static int[] reverseArray() {
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        int[] numbers = {89, 2354, 3546, 23, 10, -923, 823, -12};
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

        int[] reversedNumbers = new int[numbers.length];
        int index = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedNumbers[index++] = numbers[i];
        }
        return reversedNumbers;
    }
}

/*
public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        reverseArray(numbers);
    }

    public static void reverseArray(int[] numbers) {
        int[] reversedNumbers = new int[numbers.length];
        int index = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedNumbers[index++] = numbers[i];
        }
        numbers = reversedNumbers;
    }
}
 */

/*
learned about reversing arrays from this site:
http://www.speakingcs.com/2015/07/how-to-reverse-array-in-java-with-and.html
 */