package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class representing a Queue that stores strings, implementing the IQueue Interface
 */
public class StringQueue implements IQueue {

    /**
     * List of Strings
     */
    private List<String> elements = new ArrayList<String>();
    /**
     * Maximum size of the String Queue
     */
    private int maxSize = 5;

    /**
     * Constructor for the String Queue class
     *
     * @param maxsize Sets the maximum size of the Queue
     */
    public StringQueue(int maxsize) {
        maxSize = maxsize;
    }

    /**
     * Adds a String to the Queue if the Queue is not full
     *
     * @param obj String to be added to the queue
     * @return True if the String could be added to queue
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     * Removes the first String and returns it, return null if the Queue is empty
     *
     * @return the first String from the Queue
     */
    @Override
    public String poll() {
        String element = peek();

        if (elements.size() == 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * Removes the first String and returns it, throw NoSuchElementException if the Queue is empty
     *
     * @return the first String from the Queue
     */
    @Override
    public String remove() {
        String element = poll();
        element = "";
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * Returns the first String, return null if it is empty
     *
     * @return the first String of the Queue
     */
    @Override
    public String peek() {
        String element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * Returns the first String, throw NoSuchElementException if the Queue is empty
     *
     * @return the first String from the Queue
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

}