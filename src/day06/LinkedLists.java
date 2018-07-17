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
        }
    }

    //02. Adds a new node with the given newValue immediately before the first value node
    public void insertBefore(int value, int newVal) {

        //AHMED VERSION
        try {
            ListNode val = new ListNode(value);
            ListNode newValue = new ListNode(newVal);
            ListNode current = this.root;
            while (current.next != val) {
                current = current.next;
            }
            current.next = newValue;
            newValue.next = val;
            }
        catch (NullPointerException e) {
            System.out.println("You have reached the end of the list.");
        }

//        ListNode current = root;
//        System.out.println("ROOT: " + root.value);
//        ListNode tempValue = null;
//        while (current.next != null) {
//            System.out.println("INSIDE WHILE/BEFORE IF (c.n.v.) = " + current.value);
//
//            if (current.value == value) {
//                System.out.println("INSIDE IF (c.v.) " + current.value + " equals " + value);
//                System.out.println();
//
//                tempValue = current.next;
//                System.out.println("C.N. = " + current.next.value);
//                System.out.println("TEMPVALUE = " + tempValue.value);
//                System.out.println();
//
//                current.next.value = newVal;
//                System.out.println("C.N.V. = " + current.next.value);
//                System.out.println("NEWVAL = " + newVal);
//                System.out.println();
//
//                current.next.next = tempValue;
//                System.out.println("BOTTOM OF IF (C.N.N) = " + current.next.next.value);
//                System.out.println("TEMPVALUE = " + tempValue.value);
//                System.out.println();
//            break;
//            }
//            current = current.next;
//        }
//        System.out.println("CURRENT = " + current.value);
    }

    //03. Adds a new node with the given newValue immediately after the first value node
    public void insertAfter (int value, int newVal) {
        ListNode current = root;
        ListNode tempValue = null;
        System.out.println("CURRENT NODE HERE: " + current.value);

        while (current.next != null) {
            System.out.println("INSIDE WHILE/BEFORE IF (c.n.v.) = " + current.value);
            if (current.value == value) {
                System.out.println("INSIDE IF (c.v.) " + current.value + " equals " + value);

                tempValue = current.next.next;
                System.out.println("TEMPVALUE = " + tempValue.value);

                current.next.next.value = newVal;
                System.out.println("C.N.N.V. = " + current.next.next.value);

                current.next.next.next = tempValue;
                System.out.println("BOTTOM OF IF (C.N.N.N) = " + tempValue.value);

                break;
            }
            current = current.next;
        }
        System.out.println(current.value);
    }


//    //Method given during class
        public int size () {
            int total = 0;

            ListNode current = this.root;
            while (current != null) {
                total++;
                current = current.next;
            }
            return total;
        }
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

    //FOUND METHOD
    //https://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
    public String toString() {
        String output = "";

        if (root != null) {
            ListNode current = root.next;
            while (current != null) {
                output += "[" + current.value + "]";
                current = current.next;
            }

        }
        return output;
    }

}
