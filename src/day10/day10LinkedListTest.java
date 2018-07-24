package day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day10LinkedListTest {

    @Test
    void reverseListWithIntegers() {
        day10LinkedList flippy = new day10LinkedList();

        for (int i = 0; i < 5; i++) {
            flippy.append(i+1);
        }

        day10ListNode actual = flippy.reverseList();
        day10ListNode expected = flippy.root;

        assertEquals(expected, actual);
    }

    @Test
    void reverseListEmptyList() {
        day10LinkedList flippy = new day10LinkedList();

        day10ListNode actual = flippy.reverseList();
        day10ListNode expected = flippy.root;

        assertEquals(expected, actual);
    }

    @Test
    void reverseListWithLargeList() {
        day10LinkedList flippy = new day10LinkedList();

        for (int i = 0; i < 99; i++) {
            flippy.append(i+1);
        }

        day10ListNode actual = flippy.reverseList();
        day10ListNode expected = flippy.root;

        assertEquals(expected, actual);
    }

}