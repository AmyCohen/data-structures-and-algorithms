package day07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListsTest {

//Could not get "set up before" working so doing it long hand until I can look into it.

    @Test
    void getValueFromEndSmallList() {
        LinkedLists ll = new LinkedLists();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        int actual = ll.getValueFromEnd(2);
        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test
    void getValueFromEndWithIndexZero() {
        LinkedLists ll = new LinkedLists();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        int actual = ll.getValueFromEnd(4);
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void getValueFromEndWithLonglist() {
        LinkedLists ll = new LinkedLists();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        ll.append(7);
        ll.append(8);
        ll.append(9);
        ll.append(10);
        ll.append(11);
        ll.append(12);
        ll.append(13);
        ll.append(14);
        ll.append(15);
        ll.append(16);
        ll.append(17);
        ll.append(18);
        ll.append(19);
        ll.append(20);


        int actual = ll.getValueFromEnd(10);
        int expected = 10;

        assertEquals(expected, actual);

    }


    //Cannot test for empty list because it throws a NullPointerException and I cannot set the error as expected.

}