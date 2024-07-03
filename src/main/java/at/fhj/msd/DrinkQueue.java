package at.fhj.msd;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class DrinkQueue {
    private ArrayList<Drink> drinks;
    private final int MAX_SIZE = 5;

    public DrinkQueue(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public boolean offer(Drink obj) {
        if (drinks.size() != MAX_SIZE) {
            drinks.add(obj);
            return true;
        } else
            return false;
    }

    public Drink poll() {
        Drink firstElement = this.peek();
        if (firstElement != null) {
            drinks.remove(0);
            return firstElement;
        } else {
            return null;
        }
    }

    public Drink remove() {
        Drink firstElement = this.peek();
        if (firstElement != null) {
            drinks.remove(0);
            return firstElement;
        } else {
            throw new NoSuchElementException();
        }
    }

    public Drink peek() {
        return (drinks.isEmpty() || drinks.get(0) == null) ? null : drinks.get(0);
    }

    public Drink element() {
        Drink firstElement = this.peek();
        if (firstElement != null) {
            return firstElement;
        } else {
            throw new NoSuchElementException();
        }
    }
}
