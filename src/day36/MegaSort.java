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
/*
https://www.geeksforgeeks.org/merge-sort/
sadly unhelpful
 */
    public static List<Integer> megaSort(List<Integer> unsorted) {
        List<Integer> sorted = new ArrayList<>();
        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondtHalf = new ArrayList<>();

        int middle = (int) Math.floor(unsorted.size() / 2);
        System.out.println("middle = " + middle);

        firstHalf = unsorted.subList(0, middle);
        System.out.println(firstHalf);
        secondtHalf = unsorted.subList(middle, unsorted.size());
        System.out.println(secondtHalf);

        while(sorted.size() < unsorted.size()) {
            for (int i = 0; i < firstHalf.size(); i++) {
                for (int j = 0; j < secondtHalf.size(); j++) {
                    if (firstHalf.get(i) > secondtHalf.get(j)) {
                        sorted.add(secondtHalf.get(j));
                        System.out.println(sorted);
                    } else {
                        sorted.add(firstHalf.get(i));
                        System.out.println(sorted);
                    }
                }
            }
        }

//        if (left < right) {
            // Find the middle point
//            int m = (left + right) / 2;

            // Sort first and second halves
//            megaSort(arr, l, m);
//            megaSort(arr, m + 1, r);
//        while (firstHalf.size() > 0) {
//            megaSort(firstHalf);
//            System.out.println("first half = " + firstHalf);
//        }
//        while(secondtHalf.size() > 1) {
//            megaSort(secondtHalf);
//            System.out.println("second half = " + secondtHalf);
//        }
            // Merge the sorted halves
//            merge(arr);
//        }
        System.out.println(sorted);
        return sorted;
    }
        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
//        public static void merge (List<Integer> unsorted){
//            List<Integer> sorted = new ArrayList<>();
//            List<Integer> firstHalf = new ArrayList<>();
//            List<Integer> secondtHalf = new ArrayList<>();
//
//            int middle = (int) Math.floor(unsorted.size() / 2);
//            System.out.println("middle = " + middle);
//
//            firstHalf = unsorted.subList(0, middle);
//            secondtHalf = unsorted.subList(middle, unsorted.size());
//
///////////////
// I already account for this with my firstHalf and secondHalf arraylists that are sublisted using the middle and the array size
            // Find sizes of two subarrays to be merged
//            int n1 = m - l + 1;
//            int n2 = r - m;

            /* Create temp arrays */
//            int L[] = new int[n1];
//            int R[] = new int[n2];

            /*Copy data to temp arrays*/
//            for (int i = 0; i < n1; ++i)
//                L[i] = arr[l + i];
//            for (int j = 0; j < n2; ++j)
//                R[j] = arr[m + 1 + j];
///////////////

            /* Merge the temp arrays */

            // Initial indexes of first and second subarrays
//            int i = 0, j = 0;
//
//            // Initial index of merged subarry array
////            int k = l;
//
//            while (i < firstHalf.size() && j < secondtHalf.size()) {
//                if (firstHalf.get(i) <= secondtHalf.get(j)) {
////                    arr[k] = L[i];
//                    System.out.println(sorted.add(firstHalf.get(i)));
//                    sorted.add(firstHalf.get(i));
//                    i++;
//                } else {
////                    arr[k] = R[j];
//                    System.out.println(sorted.add(secondtHalf.get(j)));
//                    sorted.add(secondtHalf.get(j));
//                    j++;
//                }
////                k++;
//            }
//
//            /* Copy remaining elements of L[] if any */
//            while (i < firstHalf.size()) {
////                arr[k] = L[i];
//                sorted.add(firstHalf.get(i));
//                i++;
////                k++;
//            }
//
//            /* Copy remaining elements of R[] if any */
//            while (j < secondtHalf.size()) {
////                arr[k] = R[j];
//                sorted.add(secondtHalf.get(j));
//                j++;
//                k++;
//            }
//        }

        // Main function that sorts arr[l..r] using
        // merge()
//        void sort ( int arr[], int l, int r)
//        {
//            if (l < r) {
//                // Find the middle point
//                int m = (l + r) / 2;
//
//                // Sort first and second halves
//                sort(arr, l, m);
//                sort(arr, m + 1, r);
//
//                // Merge the sorted halves
//                merge(arr, l, m, r);
//            }
//        }

}