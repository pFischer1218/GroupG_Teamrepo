package at.fhj.msd;
import java.util.List;

public class Cocktail extends Drink {
    private List<Liquid> liquids;

    public Cocktail(String name, List<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    @Override
    public double getVolume() {
        double volume = 0.0;
        for (Liquid l : liquids) {
            volume += l.getVolume();
        }
        return volume;
    }

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

    @Override
    public boolean isAlcoholic() {
        return this.getAlcoholPercent() > 0;
    }
}
