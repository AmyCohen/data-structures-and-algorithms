package day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day10LinkedListTest {

    @Test
    void reverseList() {
        day10LinkedList flippy = new day10LinkedList();

        for (int i = 0; i < 5; i++) {
            flippy.append(i+1);
        }
        System.out.println(flippy.toString());

        String actual = flippy.reverseList();
        String expected = "[5, 4, 3, 2, 1]";

        assertEquals(expected, actual);
    }
}