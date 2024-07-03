package at.fhj.msd;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Class representing a Queue, consisting of <code>Drink</code> objects
 */
public class DrinkQueue {
    /**
     * List of Drinks
     */
    private ArrayList<Drink> drinks;
    /**
     * Maximum Size of the Queue
     */
    private int maxSize = 5;

    /**
     * Constructor for the DrinkQueue that takes a List of Drinks as its parameter
     *
     * @param maxSize Maximum Size of the Queue
     */
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Adds a Drink to the Queue, provided the Queue is not full
     *
     * @param obj Drink to be added to the Queue
     * @return True if the Drink has been added, false if the Drink couldn't be added
     */
    public boolean offer(Drink obj) {
        if (drinks.size() != maxSize) {
            drinks.add(obj);
            return true;
        } else
            return false;
    }

    /**
     * Returns the Drink object at the start of the queue. Note that the element is thus removed from the
     * queue. If the queue is empty, the method returns <code>null</code>.
     *
     * @return Drink at the start of the queue.
     */
    public Drink poll() {
        Drink firstElement = this.peek();
        if (firstElement != null) {
            drinks.remove(0);
            return firstElement;
        } else {
            return null;
        }
    }

    /**
     * Returns the Drink object at the start of the queue and removes it.
     * If the queue is empty, the method throws a NoSuchElementException.
     *
     * @return Drink at the start of the queue.
     */
    public Drink remove() {
        Drink firstElement = this.peek();
        if (firstElement != null) {
            drinks.remove(0);
            return firstElement;
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * Returns the Drink object at the start of the queue. The element remains in the queue.
     * If the queue is empty, the method returns <code>null</code>.
     *
     * @return Drink at the start of the queue without removing it.
     */
    public Drink peek() {
        return (drinks.isEmpty() || drinks.get(0) == null) ? null : drinks.get(0);
    }

    /**
     * Returns the Drink object at the start of the queue. The element remains in the queue.
     * If the queue is empty, the method throws a NoSuchElementException.
     *
     * @return Drink at the start of the queue without removing it.
     */
    public Drink element() {
        Drink firstElement = this.peek();
        if (firstElement != null) {
            return firstElement;
        } else {
            throw new NoSuchElementException();
        }
    }
}
