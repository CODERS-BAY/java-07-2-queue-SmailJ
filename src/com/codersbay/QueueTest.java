package com.codersbay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {

    @Test
    public void queueTest() throws QueueTooSmallException {
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        assertTrue(myQueue.size() == 1);
        myQueue.enqueue(2);
        assertTrue(myQueue.size() == 2);
    }

    @Test
    public void sizeTest() throws QueueTooSmallException {
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        assertTrue(myQueue.size() == 6);
    }

    @Test
    public void dequeueTest() throws QueueTooSmallException {
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        assertTrue(myQueue.size() == 3);
        int temp = myQueue.dequeue();
        System.out.println(temp);
        assertTrue(myQueue.size() == 2);
    }

    @Test
    public void errorTest() throws QueueTooSmallException {
        Queue myQueue = new Queue();
        assertThrows(QueueTooSmallException.class, () -> {
            assertTrue(myQueue.dequeue() == 0);
        });

    }

}
