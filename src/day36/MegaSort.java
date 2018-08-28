package day36;

import java.util.ArrayList;
import java.util.List;

public class MegaSort {
    public static void main(String[] args) {
        ArrayList<Integer> unsorted = new ArrayList<>();
        unsorted.add(34);
        unsorted.add(19);
        unsorted.add(42);
        unsorted.add(-9);
        unsorted.add(2018);
        unsorted.add(0);
        unsorted.add(2005);
        unsorted.add(77);
        unsorted.add(2099);

        System.out.println(unsorted);

        megaSort(unsorted);
    }
    public static List<Integer> megaSort (List<Integer> unsorted) {
        List<Integer> sorted = new ArrayList<>();
        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondtHalf = new ArrayList<>();

        int middle = (int) Math.floor(unsorted.size() / 2);
        System.out.println("middle = " + middle);

        firstHalf = unsorted.subList(0, middle);
        secondtHalf = unsorted.subList(middle, unsorted.size());

        System.out.println("first half = " + firstHalf);
        System.out.println("second half = " + secondtHalf);
        System.out.println("unsorted = " + unsorted);

        List<Integer> left = firstHalf;
        List<Integer> right = secondtHalf;

            while (left.size() > 1) {
                left = (megaSort(firstHalf));
                System.out.println("left split = " + left);
                rejoin(left);
                System.out.println("left joined = " + left);
            }
            while (right.size() > 1) {
                right = megaSort(secondtHalf);
                System.out.println("right split = " + right);
                rejoin(right);
                System.out.println("right joined = " + right);
            }
//            sorted.addAll(left);
//            sorted.addAll(right);

        System.out.println("sorted = " + sorted);
        return sorted;
    }

    private static List<Integer> rejoin (List<Integer> splitArray) {
        List<Integer> sortingArray = new ArrayList<>();

        for (int i = 0; i < splitArray.size()-1; i++) {
            if (splitArray.get(i) < splitArray.get(i + 1)) {
                sortingArray.add(splitArray.get(i));
            }


        }
        return sortingArray;
    }
}
