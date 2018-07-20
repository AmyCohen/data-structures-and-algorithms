package day09;


public class day09LinkedList {

    public day09ListNode root;


    public day09LinkedList() {

        this.root = null;
    }

    public Boolean hasLoop () {
        day09ListNode current1 = root;
        day09ListNode current2 = root.next.next;
        Boolean isLoop = false;

        while (current1 != null){
            current1 = current1.next;
            current2 = current2.next.next;

            if (current1 == current2){
                System.out.println("found a loop");
                isLoop = true;
                break;
            } else if (current2.next == null){
                isLoop = false;
                break;
            }
        }
        return isLoop;
    }

    public day09LinkedList mergeLists(day09LinkedList list1, day09LinkedList list2) {

        day09LinkedList list3 = new day09LinkedList();

        if (list1.size() > list2.size()) {
            System.out.println("List 1 is bigger");
            list3 = mergeListWhenOneIsLarger(list1, list2);
        } else if (list1.size() < list2.size()) {
            System.out.println("List 2 is bigger");
            list3 = mergeListWhenTwoIsLarger(list1, list2);
        } else if (list1.size() == list2.size()) {
            System.out.println("The Lists are equal");
            list3 = mergeListWhenEqualSize(list1, list2);
        }

        System.out.println(list3.toString());
        return list3;
    }

    //Helper function for mergeLists.
    public static day09LinkedList mergeListWhenOneIsLarger (day09LinkedList list1, day09LinkedList list2) {
        day09LinkedList list3 = new day09LinkedList();

        for (int i = 0; i < list1.size(); i++) {
            if (list2.size() > i) {
                list3.append(list1.get(i));
                list3.append((list2.get(i)));
            } else {
                list3.append(list1.get(i));
            }
        }
            return list3;
    }

    //Helper function for mergeLists.
    public static day09LinkedList mergeListWhenTwoIsLarger (day09LinkedList list1, day09LinkedList list2) {
        day09LinkedList list3 = new day09LinkedList();

        for (int i = 0; i < list2.size(); i++) {
            if (list1.size() > i) {
                list3.append(list1.get(i));
                list3.append((list2.get(i)));
            } else {
                list3.append(list2.get(i));
            }
        }
        return list3;
    }

    //Helper function for mergeLists.
    public static day09LinkedList mergeListWhenEqualSize (day09LinkedList list1, day09LinkedList list2) {
        day09LinkedList list3 = new day09LinkedList();

        for (int i = 0; i < list1.size(); i++) {
            list3.append(list1.get(i));
            list3.append((list2.get(i)));
        }
        return list3;
    }



    //PREVIOUS METHODS

    public day09ListNode kthElementFromEnd(int k) {
        day09ListNode node = new day09ListNode(k);
        day09ListNode current = root;
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
        day09ListNode nn = new day09ListNode(data);
        nn.next = this.root;
        this.root = nn;
    }

    public void append(int value) {
        day09ListNode addLast = new day09ListNode(value);
        day09ListNode current = root;

        if (root == null) {
            this.root = new day09ListNode(value);
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
            day09ListNode temp = root;
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

        day09ListNode current = this.root;
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

        day09ListNode node = new day09ListNode(value);
        day09ListNode current = this.root;

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
        day09ListNode node = new day09ListNode(newValue);
        day09ListNode current = this.root;

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
        day09ListNode current = this.root;

        while (n < valueAtIndex) {
            n++;
            current = current.next;
        }
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
        day09ListNode current = this.root;

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
