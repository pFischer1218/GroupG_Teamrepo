package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {

    private DrinkQueue drinkQueue;

    private Liquid liquid1 = new Liquid("Liquid1", 0.1, 0.0);
    private Liquid liquid2 = new Liquid("Liquid2", 0.5, 0.5);

    private SimpleDrink drink1 = new SimpleDrink("Drink1",liquid1);
    private SimpleDrink drink2 = new SimpleDrink("Drink2",liquid1);

    private SimpleDrink drink3 = new SimpleDrink("Drink2",liquid1);

    @BeforeEach
    public void newDrinkQueue(){
        drinkQueue =new DrinkQueue(2);
}


    @Test
    void testPeek1(){
        assertNull(drinkQueue.peek());
    }

    @Test
    void testPeek2(){
        drinkQueue.offer(drink1);
        assertEquals(drink1,drinkQueue.peek());
    }

    @Test
    void testOffer1(){
        assertTrue(drinkQueue.offer(drink1));
    }

    @Test
    void testOffer2(){
        drinkQueue.offer(drink1);
        assertTrue(drinkQueue.offer(drink2));
    }

    @Test
    void testOffer3(){
        drinkQueue.offer(drink1);
        drinkQueue.offer(drink2);
        assertFalse(drinkQueue.offer(drink3));
    }

    @Test
    void testPoll1(){
        drinkQueue.offer(drink1);
        drinkQueue.offer(drink2);
        assertEquals(drink1, drinkQueue.poll());
        assertEquals(drink2, drinkQueue.peek());
    }

    @Test
    void testPoll2(){
        assertNull(drinkQueue.poll());
    }

    @Test
    void testRemove1(){
        drinkQueue.offer(drink1);
        drinkQueue.offer(drink3);
        assertEquals(drink1,drinkQueue.remove());
    }

    @Test
    void testRemove2(){
        assertThrows(NoSuchElementException.class, () -> {
            drinkQueue.remove();
        });
    }

    @Test
    void testElement1(){
        drinkQueue.offer(drink1);
        drinkQueue.offer(drink3);
        assertEquals(drink1,drinkQueue.element());
    }

    @Test
    void testElement2(){
        assertThrows(NoSuchElementException.class, () -> {
            drinkQueue.element();
        });
    }



}
