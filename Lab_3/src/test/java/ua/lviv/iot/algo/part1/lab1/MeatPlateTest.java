package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeatPlateTest {

    @Test
    void getMaxFoodWeight() {
        MeatPlate meat = new MeatPlate(20, "steel", "white", false,true, 10, "chicken");
        meat = new MeatPlate(18, "clay", "black", true,true, 12, "beef");
        assertEquals(meat.getMaxFoodWeight() > 100, meat. getMaxFoodWeight() > 100);
    }

    @Test
    void testToString() {
        MeatPlate meat = new MeatPlate(20, "steel", "white", false,true, 10, "chicken");
        assertEquals("MeatPlate{" +
                "height=" + 10 +
                ", meatInPlate='" + "chicken" + '\'' +
                ", diameter=" + 20 +
                ", material='" + "steel" + '\'' +
                ", color='" + "white" + '\'' +
                ", isClean=" + false +
                ", hasFood=" + true +
                '}', meat.toString());
    }
    @Test
    void testGetColor() {
        MeatPlate meat = new MeatPlate(20, "steel", "white", false,true, 10, "chicken");
        assertEquals(meat.color, "white");
    }
}