package day08;

public class LinkedList {

    public ListNode root;
    public ListNode current;


    public LinkedList() {

        this.root = null;
    }



    //PREVIOUS METHODS

    public ListNode kthElementFromEnd(int k) {
        ListNode node = new ListNode(k);
        ListNode current = root;
        int count = 0;

        while (current != null) {
            count ++;
            if (current.next != null) {
                current = current.next;
            } else {
                break;
            }
        }
        //adding 1 to k to account for a zero index
        int nodeIndex = count - (k+1);
        System.out.println("NodeIndex = " + nodeIndex);
        System.out.println("current.data = " + current.data);
        current = root;
        if (nodeIndex == 0) {
            node = current;
        } else {
            for (int i = 0; i < nodeIndex; i++) {

                current = current.next;
                node = current;
            }
        }
        System.out.println("Node Data = " +node.data);
//        return node.data;
        return node;


    }

    public void append(int value) {
        ListNode addLast = new ListNode(value);
        ListNode current = root;

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

    //Written by Tyler Pearson
    public void printList() {
        if (root == null) {
            System.out.println("<");
            System.out.println(">");
        } else {
            ListNode temp = root;
            System.out.println("<");
            while (temp != null) {
                if (temp == this.root) {
                    System.out.print("[" + temp.data + "]" + "-->");
                } else {
                    System.out.print("[" + temp.data + "]");
                    System.out.print("-->");
                }
                temp = temp.next;
            }
            System.out.println("[end]>");
        }
    }

    public int size () {
        int total = 0;

        ListNode current = this.root;
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    public void insertBefore(int value, int newVal) {

        try {
            ListNode newValue = new ListNode(newVal);
            ListNode current = this.root;

            while (current.next.data != value) {
                current = current.next;
            }
            newValue.next = current.next;
            current.next = newValue;
        }
        catch (NullPointerException e) {
            System.out.println("You have reached the end of the list.");
        }
    }

    public void insertAfter (int value, int newVal) {
        try {
            ListNode newValue = new ListNode(newVal);
            ListNode current = this.root;

            while (current.data != value) {
                current = current.next;
            }
            newValue.next = current.next;
            current.next = newValue;
        }
        catch (NullPointerException e) {
            System.out.println("You have reached the end of the list.");
        }
    }

    //Method given during class
    public int get (int index) {
        int n = 0;
        ListNode current = this.root;

        while (n < index) {
            n++;
            current = current.next;
        }
        System.out.println(current.data);
        return current.data;
    }

    //    Method given during class
    public boolean isEmpty () {
        return this.root == null;
    }

    //Method written in class
    public String toString() {
        if (this.root == null) {
            return "[]";
        }

        String result = "";
        ListNode current = this.root;

        while (current != null) {
            result += current.data;

            // if there's another node after this one
            // then place a comma and a space
            if (current.next != null) {
                result += ", ";
            }

            current = current.next;
        }

        return "[" + result + "]";
    }


}
