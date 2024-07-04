package at.fhj.msd;

/**
 * Interface for a Queue
 */
public interface IQueue {

    /**
     * Add an Object to the Queue
     *
     * @param obj Object to be added to the queue
     * @return true once the object has been added
     */
    public abstract boolean offer(String obj);

    /**
     * Returns and deletes the first object in the queue, returns null if the queue is empty
     *
     * @return The first object in the queue
     */
    public abstract String poll();

    /**
     * Returns and deletes the first object in the queue, throws NoSuchElementException if the queue is empty
     *
     * @return The first object in the queue
     */
    public abstract String remove();

    /**
     * Returns the first object in the queue, returns null if the queue is empty
     *
     * @return The first object in the queue, without deleting it
     */
    public abstract String peek();

    /**
     * Returns the first object in the queue, throws NoSuchElementException if the queue is empty
     *
     * @return The first object in the queue, without deleting it
     */
    public abstract String element();
}