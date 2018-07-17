package day06;

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


        ll.insertBefore(4, 77);
        ll.insertBefore(2, 99);
        ll.insertBefore(99, 100);



//        ll.getIndex(14);
//        System.out.println(ll.getIndex(14));
//        System.out.println(ll.size());
//        System.out.println("Index 0 is " + ll.get(0) + ". Should be 19");
//        System.out.println("Index 1 is " + ll.get(1) + ". Should be 22");
//        System.out.println("Index 2 is " + ll.get(2) + ". Should be 1");
//        System.out.println("Index 3 is " + ll.get(3));
//        System.out.println("Index 4 is " + ll.get(4));




//        LinkedList help = new LinkedList();
//        help.addLast(16);

        /**
         * Links e as last element.
        void linkLast(E e) {
            final LinkedList.Node<E> l = last;
            final LinkedList.Node<E> newNode = new LinkedList.Node<>(l, e, null);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
            modCount++;
        }
         */
    }


}
