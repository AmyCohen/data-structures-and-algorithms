package day08;

import static java.lang.Integer.parseInt;

public class LinkedList {

    public ListNode root;


    public LinkedList() {

        this.root = null;
    }


    public LinkedList mergeLists(LinkedList list1, LinkedList list2) {

        LinkedList list3 = new LinkedList();

        if (list1.size() > list2.size()) {
            System.out.println("List 1 is bigger, start here.");
            for (int i = 0; i < list1.size(); i++) {
                if (list2.size() > i) {
                    list3.append(list1.get(i));
                    list3.append((list2.get(i)));
                } else {
                    list3.append(list1.get(i));
                }
                System.out.println(list3);
            }

        } else if (list1.size() < list2.size()) {
            System.out.println("List 2 is bigger, start here.");

        } else if (list1.size() == list2.size()) {
            System.out.println("The Lists are equal");
            for (int i = 0; i < list1.size(); i++) {
                list3.append(list1.get(i));
                list3.append((list2.get(i)));
                System.out.println(list3);
            }
        }

        //If List 2 is bigger
        for (int i = 0; i < list2.size(); i++) {
            if (list1.size() > i) {
                list3.append(list1.get(i));
                list3.append((list2.get(i)));
            } else {
                list3.append(list2.get(i));
            }
            System.out.println(list3);
        }



        System.out.println(list3.toString());
        return list3;
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

    public void prepend(int data) {
        ListNode nn = new ListNode(data);
        nn.next = this.root;
        this.root = nn;
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

    //Using method Steve wrote in class to replace the one I worked on.
    public void insertBefore(int target, int value) {
        // if the target is at the root of the list
        // then handle the special case that we need to replace
        // explicitly the root and not just attaching it between two
        // nodes in the middle of the list.
        if (this.root.data == target) {
            this.prepend(value);
        }

        ListNode node = new ListNode(value);
        ListNode current = this.root;

        // step through the list until we get to a current node
        // that has the target value
        while (current.next.data != target) {
            current = current.next;
        }

        // now tie the new node into the list
        node.next = current.next;
        current.next = node;
    }

    //Using method Steve wrote in class to replace the one I worked on.
    public void insertAfter(int target, int newValue) {
        ListNode node = new ListNode(newValue);
        ListNode current = this.root;

        // step through the list until we get to a current node
        // that has the target value
        while (current.data != target) {
            current = current.next;
        }

        // now tie the new node into the list
        node.next = current.next;
        current.next = node;
    }

    //Method given during class
    public int get (int valueAtIndex) {
        int n = 0;
        ListNode current = this.root;

        while (n < valueAtIndex) {
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
