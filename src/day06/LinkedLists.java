package day06;

public class LinkedLists {

    public ListNode root;
    public ListNode current;
    public ListNode insertValue;


    public LinkedLists() {
        this.root = null;
    }

    //01. Adds a new node with the given value to the end of the list
    public void append(int value) {
        ListNode addLast = new ListNode(value);

        if (root == null) {
            this.root = new ListNode(value);
        } else {
            current = root;
        }

        if (current != null) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = addLast;
//            System.out.println(current.value);
        }
    }

    //02. Adds a new node with the given newValue immediately before the first value node
    public void insertBefore(int value, int newVal) {
        ListNode current = root;
        System.out.println("CURRENT NODE HERE: " + current.value);

        //TRAVIS METHOD
//        ListNode tempValue = null;
//        while (current.next.value != value) {
//        current = current.next;
//            System.out.println(current.next.value);
//          }
//        tempValue.next = current.next;
//        System.out.println("tempValue: " + tempValue.value);
//        current.next = tempValue;
//        System.out.println(current.next.value);

        ListNode tempValue = null;
        while (current.next != null) {
            System.out.println("INSIDE WHILE: current.value = " + current.value);
            if (current.value == value) {
                tempValue = current.next;
                System.out.println("tempValue = " + tempValue.value);

                current.next.value = newVal;
                System.out.println("current.next.value = " + current.next.value);

                current.next.next = tempValue;
                System.out.println("current.next.next.value " + current.next.next.value);
                break;
            }
            System.out.println("current.next.next.val: " + current.next.next.value);
            current = current.next;
        }
        System.out.println("current.value (end of method) " + current.value);
    }

    //03. Adds a new node with the given newValue immediately after the first value node
//    public void insertAfter (int value, int newVal) {

//    }

//    //Method given during class
//        public int size () {
//            int total = 0;
//
//            ListNode current = this.root;
//            while (current != null) {
//                total++;
//                current = current.next;
//            }
//            return total;
//        }
//
//    //Method given during class
//        public int get (int index) {
//            int n = 0;
//            ListNode current = this.root;
//
//            while (n < index) {
//                n++;
//                current = current.next;
//            }
//            System.out.println(current.value);
//            return current.value;
//        }

    //Method given during class
//        public boolean isEmpty () {
//            return this.root == null;
//        }

}
