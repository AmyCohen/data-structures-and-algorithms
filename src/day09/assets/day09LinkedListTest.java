package day09.assets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day09LinkedListTest {

//    @Test
//    void LoopedList() {
//
//        day09LinkedList loopy = new day09LinkedList();
//
//        day09ListNode n1 = new day09ListNode(1);
//        day09ListNode n2 = new day09ListNode(7);
//        day09ListNode n3 = new day09ListNode(2);
//        day09ListNode n4 = new day09ListNode(3);
//        day09ListNode n5 = new day09ListNode(5);
//
//        System.out.println(loopy.toString());
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = n2;
//
//        loopy.root = n1;
//
//        Boolean actual = loopy.hasLoop();
//        Boolean expected = true;
//
//        assertEquals(expected, actual);
//    }

    @Test
    void NotLoopedList() {

        day09LinkedList loopy = new day09LinkedList();

        day09ListNode n1 = new day09ListNode(1);
        day09ListNode n2 = new day09ListNode(7);
        day09ListNode n3 = new day09ListNode(2);
        day09ListNode n4 = new day09ListNode(3);
        day09ListNode n5 = new day09ListNode(5);

        System.out.println(loopy.toString());
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        loopy.root = n1;

        Boolean actual = loopy.hasLoop();
        Boolean expected = false;

        assertEquals(expected, actual);
    }






}