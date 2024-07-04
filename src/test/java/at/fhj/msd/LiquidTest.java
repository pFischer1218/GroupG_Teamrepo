package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LiquidTest {

    private Liquid liquid;

    @BeforeEach
    void newLiquid() {
        liquid = new Liquid("TestLiquid",0.5,0.5);
    }

    @Test
    void testGetName(){
        assertEquals("TestLiquid",liquid.getName());
    }

    @Test
    void testSetName(){
        liquid.setName("ChangedName");
        assertEquals("ChangedName",liquid.getName());
    }

    @Test
    void testGetVolume(){
        assertEquals(0.5,liquid.getVolume());
    }

    @Test
    void testSetVolume(){
        liquid.setVolume(0.1);
        assertEquals(0.1,liquid.getVolume());
    }

    @Test
    void testGetAlcoholPercent(){
        assertEquals(0.5,liquid.getAlcoholPercent());
    }

    @Test
    void testSetAlcoholPercent(){
        liquid.setAlcoholPercent(0.33);
        assertEquals(0.33,liquid.getAlcoholPercent());
    }

}
