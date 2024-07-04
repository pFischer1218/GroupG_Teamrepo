package at.fhj.msd;

import at.fhj.msd.SimpleDrink;
import at.fhj.msd.Liquid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    private SimpleDrink simpleDrink;
    private Liquid liquid1 = new Liquid("Liquid1", 0.1, 0.0);
    private Liquid liquid2 = new Liquid("Liquid2", 0.5, 25.0);


    @Test
    void testVolume1() {
        simpleDrink = new SimpleDrink("TestsimpleDrink", liquid1);
        assertEquals(0.1, simpleDrink.getVolume());
    }

    @Test
    void testVolume2() {

        simpleDrink = new SimpleDrink("TestsimpleDrink", liquid2);

        assertEquals(0.5, simpleDrink.getVolume());
    }

    @Test
    void testAlcoholPercent1() {
        simpleDrink = new SimpleDrink("TestsimpleDrink", liquid1);

        assertEquals(0, simpleDrink.getAlcoholPercent());
    }

    @Test
    void testAlcoholPercent2() {
        simpleDrink = new SimpleDrink("TestsimpleDrink", liquid2);

        assertEquals(25, Math.round(simpleDrink.getAlcoholPercent()));
    }

    @Test
    void testIsAlcoholic1(){
        simpleDrink = new SimpleDrink("TestsimpleDrink", liquid1);
        assertFalse(simpleDrink.isAlcoholic());
    }

    @Test
    void testIsAlcoholic2(){
        simpleDrink = new SimpleDrink("TestsimpleDrink", liquid2);
        assertTrue(simpleDrink.isAlcoholic());
    }
}
