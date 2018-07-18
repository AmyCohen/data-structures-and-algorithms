package day06;

public class LinkedLists {

    public ListNode root;
    public ListNode current;


    public LinkedLists() {
        this.root = null;
    }

    //It's not pretty, but I'm proud of this one because I wrote it without help. Slowly starting to understand.
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

        //Modified by adding ".next" to the while loop so it would look ahead and stop before passing what I needed
        //to insert before. Method discussed in class.
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

    //03. Adds a new node with the given newValue immediately after the first value node
    public void insertAfter (int value, int newVal) {
        //AHMED VERSION with my own slight mods
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
