package at.fhj.msd;
import java.util.List;

/**
 * Class representing a Cocktail, consisting of one or more <code>Liquid</code> Objects
 */
public class Cocktail extends Drink {
    private List<Liquid> liquids;


    /**
     * A <code>Cocktail</code> consists of a name and a list of <code>Liquid</code> ingredients
     * @param name Name of the Cocktail
     * @param liquids List of Liquids that serve as ingredients for the Cocktail
     */
    public Cocktail(String name, List<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    /**
     * Adds the volume of each ingredient together
     * @return The volume of the cocktail
     */
    @Override
    public double getVolume() {
        double volume = 0.0;
        for (Liquid l : liquids) {
            volume += l.getVolume();
        }
        return volume;
    }

    /**
     * Adds the alcohol content of each ingredient together
     * @return The alcohol percentage of the cocktail
     */
    @Override
    public double getAlcoholPercent() {
        double drinkVolume = getVolume();
        double alcoholVolume = 0.0;

        if (drinkVolume == 0)
            return 0.0;

        for (Liquid l : liquids) {
            alcoholVolume += (l.getVolume() * l.getAlcoholPercent() / 100);
        }

        return (alcoholVolume / drinkVolume) * 100;
    }

    /**
     * Checks if the Cocktail is alcoholic or not
     * @return True if the alcohol percentage is above 0, false if it is not
     */
    @Override
    public boolean isAlcoholic() {
        return this.getAlcoholPercent() > 0;
    }
}
