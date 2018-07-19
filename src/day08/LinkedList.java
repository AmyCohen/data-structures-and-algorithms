package day08;

public class LinkedList {

    public ListNode root;


    public LinkedList() {

        this.root = null;
    }

//    public LinkedList mergeLists (LinkedList list1, LinkedList list2) {
//        ListNode current = root;
//        ListNode combinedList = root;
//        ListNode list1current = new ListNode(list1);
//        ListNode list2current = new ListNode(list2);
//        LinkedList merge = new LinkedList();
//
//        if (list1.size() < list2.size() ) {
//            System.out.println("List 1 is bigger, start here.");
//        } else if (list1.size() > list2.size() ) {
//            System.out.println("List 2 is bigger, start here.");
//        } else if (list1.size() == list2.size()) {
//            System.out.println("The Lists are equal");
//        }
//
//        for (int i = 0; i < list1.size(); i++) {
//            list1.insertAfter(list1.get(i), list2.get(i));
//            System.out.println(list1);
//        }


//        int countList1 = 0;
//        int countList2 = 0;

//        list1current = this.root;
//        list2current = this.root;

//        while (list1current != null){
//            for (int i = 0; i < list1.size()-1; i++) {
//                countList1++;
//                current = current.next;
//            }


//            for (int i = 0; i < list1.size(); i++) {
//                merge.append(list1current.data);
//                while (list1current != null) {
//                    list1current = list1current.next;
//                    System.out.println(merge.toString());
//                }
//            }



//        System.out.println("Count 1 Value: " + list1current.value.toString());
//        System.out.println("Count 1 List: " + countList1);

//        while (list2current != null){
//            countList2++;
//            list2current = list2current.next;
//        }



//        Boolean isRunning = true;

//        while (list1current.next != null) {


//            while (list1 != null) {
//                System.out.println("List 1 Merged Value: " + mergedList.data);
//                list1current = list1current.next;
//                System.out.println("List s 1 Current Value: " + list1current.data);
//                mergedList.next.next = list1current.next;

//            }
//            if (list2 != null) {
//                mergedList.next = list2current;
//                System.out.println("List 2 Merged Value: " + mergedList.data);
//                list2current = list2current.next;
//                System.out.println("List 2 Current Value: " + list1current.data);
//            }
//                mergedList = mergedList.next;
//                isRunning = false;
//            System.out.println("End mergedList = " + mergedList.data);
//            return current.data;
//        }
//                return merge;
//    }

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
