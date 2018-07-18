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
<<<<<<< HEAD
ll.insertAfter(4, 77);
        ll.insertAfter(2, 99);
        ll.insertBefore(99, 100);
//        ll.insertBefore(3, 11);
ll.printList();
        System.out.println("TO STRING METHOD: " + ll.toString());
=======
ll.insertBefore(4, 77);
        ll.insertBefore(2, 99);
        ll.insertBefore(99, 100);
        ll.insertBefore(3, 11);
ll.printList();
        System.out.println(ll.toString());
//        System.out.println("TO STRING METHOD: " + ll.toString());
>>>>>>> bc3e8994fe41c49a42c60d793cc6f8c24ef84849


//        ll.insertAfter(1, 88);
//        ll.insertAfter(4,16);
    }


}
