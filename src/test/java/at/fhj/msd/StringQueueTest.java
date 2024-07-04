package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {

    private StringQueue stringQueue;

    @BeforeEach
    public void newstringQueue() {
        stringQueue = new StringQueue(2);
    }


    @Test
    void testPeek1() {
        assertNull(stringQueue.peek());
    }

    @Test
    void testPeek2() {
        stringQueue.offer("TestString");
        assertEquals("TestString", stringQueue.peek());
    }

    @Test
    void testOffer1() {
        assertTrue(stringQueue.offer("TestString"));
    }

    @Test
    void testOffer2() {
        stringQueue.offer("TestString");
        assertTrue(stringQueue.offer("TestString2"));
    }

    @Test
    void testOffer3() {
        stringQueue.offer("TestString");
        stringQueue.offer("TestString2");
        assertFalse(stringQueue.offer("TestString3"));
    }

    @Test
    void testPoll1(){
        stringQueue.offer("TestString");
        stringQueue.offer("TestString2");
        assertEquals("TestString", stringQueue.poll());
        assertEquals("TestString", stringQueue.peek());
    }

    @Test
    void testPoll2(){
        assertThrows(IndexOutOfBoundsException.class, () -> {
            stringQueue.poll();
        });
    }

    @Test
    void testRemove1() {
        stringQueue.offer("TestString");
        stringQueue.offer("TestString3");
        assertEquals("", stringQueue.remove());
    }

    @Test
    void testRemove2() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            stringQueue.remove();
        });
    }

    @Test
    void testElement1() {
        stringQueue.offer("TestString");
        stringQueue.offer("TestString3");
        assertEquals("TestString", stringQueue.element());
    }

    @Test
    void testElement2() {
        assertThrows(NoSuchElementException.class, () -> {
            stringQueue.element();
        });
    }
}
