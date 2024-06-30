package at.fhj.msd;
import java.util.List;

public class Cocktail extends Drink {
    private List<Liquid> liquids;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     * @param liquids drink ingredients
     */
    public Cocktail(String name, List<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
