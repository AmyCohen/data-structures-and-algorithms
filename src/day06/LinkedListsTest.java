package day06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListsTest {

    @Test
    void appendStandard() {
        LinkedLists ll = new LinkedLists();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        String actual = ll.toString();
        String expected = "[1, 2, 3, 4, 5]";

        assertEquals(expected, actual);
    }

    @Test
    void appendNothing() {
        LinkedLists ll = new LinkedLists();

        String actual = ll.toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    void appendOneValue() {
        LinkedLists ll = new LinkedLists();

        ll.append(1);

        String actual = ll.toString();
        String expected = "[1]";

        assertEquals(expected, actual);
    }



    @Test
    void insertBefore() {
        LinkedLists ll = new LinkedLists();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        ll.insertBefore(3, 99);

        String actual = ll.toString();
        String expected = "[1, 2, 99, 3, 4, 5]";

        assertEquals(expected, actual);
    }

    @Test
    void insertBeforeWithEmptyList() {
        LinkedLists ll = new LinkedLists();

        ll.insertBefore(3, 99);

        String actual = ll.toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    void insertBeforeWithValueNotPresent() {
        LinkedLists ll = new LinkedLists();

        ll.append(1);
        ll.append(2);
        ll.append(4);
        ll.append(5);

        ll.insertBefore(3, 99);

        String actual = ll.toString();
        String expected = "[1, 2, 4, 5]";

        assertEquals(expected, actual);
    }


    @Test
    void insertAfter() {
        LinkedLists ll = new LinkedLists();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        ll.insertAfter(3, 99);

        String actual = ll.toString();
        String expected = "[1, 2, 3, 99, 4, 5]";

        assertEquals(expected, actual);
    }

    @Test
    void insertAfterWithEmptyList() {
        LinkedLists ll = new LinkedLists();

        ll.insertBefore(3, 99);

        String actual = ll.toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    void insertAfterWithValueNotPresent() {
        LinkedLists ll = new LinkedLists();

        ll.append(1);
        ll.append(2);
        ll.append(4);
        ll.append(5);

        ll.insertBefore(3, 99);

        String actual = ll.toString();
        String expected = "[1, 2, 4, 5]";

        assertEquals(expected, actual);
    }

}
