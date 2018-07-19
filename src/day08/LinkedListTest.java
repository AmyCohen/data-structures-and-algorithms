package day08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void mergeListsEqualSize() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);

        list2.append(5);
        list2.append(6);
        list2.append(7);
        list2.append(8);

        String actual = list3.mergeLists(list1, list2).toString();
        String expected = "[1, 5, 2, 6, 3, 7, 4, 8]";

        assertEquals(expected, actual);
    }

    @Test
    void mergeWhenFirstListIsLarger() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(0);

        list2.append(5);
        list2.append(6);
        list2.append(7);
        list2.append(8);

        String actual = list3.mergeLists(list1, list2).toString();
        String expected = "[1, 5, 2, 6, 3, 7, 4, 8, 0]";

        assertEquals(expected, actual);
    }
    @Test
    void mergeWhenSecondListIsLarger() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);

        list2.append(5);
        list2.append(6);
        list2.append(7);
        list2.append(8);
        list2.append(9);

        String actual = list3.mergeLists(list1, list2).toString();
        String expected = "[1, 5, 2, 6, 3, 7, 4, 8, 9]";

        assertEquals(expected, actual);
    }

    @Test
    void mergeWhenBothAreEmpty() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        String actual = list3.mergeLists(list1, list2).toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }


}