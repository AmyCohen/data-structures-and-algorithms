package day14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    @Test
    void InitialTest() {
        MaxStack stack1 = new MaxStack();
        stack1.push(3);
        stack1.push(6);
        stack1.push(1);
        stack1.push(9);
        stack1.push(7);

        int actual = stack1.max();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void pushingNewHigh() {
        MaxStack stack1 = new MaxStack();
        stack1.push(3);
        stack1.push(6);
        stack1.push(1);
        stack1.push(9);
        stack1.push(7);

        stack1.push(99);
        stack1.push(0);

        int actual = stack1.max();
        int expected = 99;

        assertEquals(expected, actual);
    }

    @Test
    void poppingNewAndOriginalHigh() {
        MaxStack stack1 = new MaxStack();
        stack1.push(3);
        stack1.push(6);
        stack1.push(1);
        stack1.push(9);
        stack1.push(7);

        stack1.push(99);
        stack1.push(0);

        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();

        int actual = stack1.max();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void emptyStack() {
        MaxStack stack1 = new MaxStack();

        int actual = stack1.max();
        int expected = 0;

        assertEquals(expected, actual);
    }

}