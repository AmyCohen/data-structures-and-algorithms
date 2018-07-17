package day06;

public class LinkedLists {

    public ListNode root;
    public int value;

    public LinkedLists (int data) {
        this.value = data;
    }

    //01. Adds a new node with the given value to the end of the list
    public void append (int value) {
        ListNode addNew = new ListNode();
        addNew.next = root;
        root = value;
    }

    //02. Adds a new node with the given newValue immediately before the first value node
    public void insertBefore (int value, int newVal) {
        int index = 0;
        int current = this.value;

        while (current < this.value) {
            index++;
        }
    }

    //03. Adds a new node with the given newValue immediately after the first value node
    public void insertAfter (int value, int newVal) {

    }
}
