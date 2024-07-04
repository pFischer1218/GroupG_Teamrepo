package at.fhj.msd;

/**
 * Class representing a Liquid, used for <code>Drink</code> Objects
 */
public class Liquid {
    /**
     * Name of the liquid
     */
    private String name;

    /**
     * Amount of liquid in litres
     */
    private double volume;

    /**
     * Alcohol percentage of the liquid
     */
    private double alcoholPercent;

    /**
     * Constructor for a <code>Liquid</code> Object
     *
     * @param name           Name of the liquid
     * @param volume         Volume of the Liquid in litres
     * @param alcoholPercent Alcohol percentage of the Liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Get the name of the Liquid
     *
     * @return Name of the Liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Set a new name for the Liquid
     *
     * @param name New name for the Liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the volume of the Liquid
     *
     * @return Volume of the Liquid
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Set the volume of the Liquid
     *
     * @param volume New volume for the Liquid
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Get the alcohol percentage of the Liquid
     *
     * @return The alcohol percentage of the Liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Set a new alcohol percentage for the Liquid
     *
     * @param alcoholPercent New alcohol percentage for the Liquid
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
