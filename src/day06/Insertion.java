package day06;

import java.util.Arrays;
import java.util.LinkedList;

public class Insertion {
    public static void main(String[] args) {

        insertion();
    }

    public static void insertion () {

        LinkedLists ll = new LinkedLists();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

ll.printList();
ll.insertBefore(4, 77);
        ll.insertBefore(2, 99);
//        ll.insertBefore(99, 100);
//        ll.insertBefore(3, 11);
ll.printList();
//        System.out.println("TO STRING METHOD: " + ll.toString());


//        ll.insertAfter(1, 88);
//        ll.insertAfter(4,16);
    }


}
