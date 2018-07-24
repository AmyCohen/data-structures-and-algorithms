package day11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithStacksTest {

    @Test
    void enqueueWithValue() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(4);
        qq.enqueue(8);
        qq.enqueue(12);
        qq.enqueue(16);
        qq.enqueue(20);

        String actual = qq.toString();
        String expected = "[4, 8, 12, 16, 20]";

        assertEquals(expected, actual);
    }

    @Test
    void enqueueEmptyQueue() {
        QueueWithStacks qq = new QueueWithStacks();

        String actual = qq.toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    void enqueueWithOneValue() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(4);

        String actual = qq.toString();
        String expected = "[4]";

        assertEquals(expected, actual);
    }

    @Test
    void dequeueWithValues() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(4);
        qq.enqueue(8);
        qq.enqueue(12);
        qq.enqueue(16);
        qq.enqueue(20);

        int actual = qq.dequeue();
        int expected = 4;

        assertEquals(expected,actual);
    }

    @Test
    void dequeueEmptyQueue() {
        QueueWithStacks qq = new QueueWithStacks();

        int actual = qq.dequeue();
        int expected = -999;

        assertEquals(expected,actual);
    }

    @Test
    void dequeueSeveralTimes() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(4);
        qq.enqueue(8);
        qq.enqueue(12);
        qq.enqueue(16);
        qq.enqueue(20);

        qq.dequeue();
        qq.dequeue();
        int actual = qq.dequeue();
        int expected = 12;

        assertEquals(expected,actual);
    }
}