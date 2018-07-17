package day06;

import javafx.scene.Node;

import java.util.LinkedList;
import java.util.List;

public class Insertion {
    public static void main(String[] args) {

        insertion();
    }

    public static List insertion () {

        int data;
        List<Integer> ll = new LinkedList<> ();
        ll.add(2);
        ll.add(4);

        ll.size();
        System.out.println(ll.size());

        return ll;
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
//            return;
        }
        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;

    }

}
