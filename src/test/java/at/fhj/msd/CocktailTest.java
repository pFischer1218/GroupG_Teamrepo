package at.fhj.msd;

import at.fhj.msd.Cocktail;
import at.fhj.msd.Liquid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class CocktailTest {



    private Cocktail cocktail;
    private ArrayList<Liquid> liquidArrayList = new ArrayList<Liquid>();
    private Liquid liquid1 = new Liquid("Liquid1", 0.1, 0.0);
    private Liquid liquid2 = new Liquid("Liquid2", 0.5, 25.0);

    @BeforeEach
    public void newSetup() {
        liquidArrayList = new ArrayList<Liquid>();
    }



    @Test
    void testVolume1() {
        cocktail = new Cocktail("TestCocktail", liquidArrayList);
        assertEquals(0, cocktail.getVolume());
    }

    @Test
    void testVolume2() {
        liquidArrayList.add(liquid1);
        liquidArrayList.add(liquid2);

        cocktail = new Cocktail("TestCocktail", liquidArrayList);

        assertEquals(0.6, cocktail.getVolume());
    }

    @Test
    void testAlcoholPercent1() {
        cocktail = new Cocktail("TestCocktail", liquidArrayList);

        assertEquals(0, cocktail.getAlcoholPercent());
    }

    @Test
    void testAlcoholPercent2() {
        liquidArrayList.add(liquid1);
        liquidArrayList.add(liquid2);

        cocktail = new Cocktail("TestCocktail", liquidArrayList);

        assertEquals(21, Math.round(cocktail.getAlcoholPercent()));
    }

    @Test
    void testIsAlcoholic1(){
        liquidArrayList.add(liquid1);
        cocktail = new Cocktail("TestCocktail", liquidArrayList);
        assertFalse(cocktail.isAlcoholic());
    }

    @Test
    void testIsAlcoholic2(){
        liquidArrayList.add(liquid1);
        liquidArrayList.add(liquid2);
        cocktail = new Cocktail("TestCocktail", liquidArrayList);
        assertTrue(cocktail.isAlcoholic());
    }
}
