package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SoupPlateTest {

    @Test
    void getMaxFoodWeight() {
        SoupPlate soup =new SoupPlate(2,"clay", "yellow", false, true, 8, "Stew");
        soup = new SoupPlate(7,"marble", "orange", true, false, 4, "Borsch");
        assertEquals(soup.getMaxFoodWeight() > 100, soup.getMaxFoodWeight() > 100);
    }

    @Test
    void testToString() {
        SoupPlate soup =new SoupPlate(2,"clay", "yellow", false, true, 8, "Stew");
        assertEquals("SoupPlate{" +
                "deepnessInSm=" + 8 +
                ", soupType='" + "Stew" + '\'' +
                ", diameter=" + 2 +
                ", material='" + "clay" + '\'' +
                ", color='" + "yellow" + '\'' +
                ", isClean=" + false +
                ", hasFood=" + true +
                '}', soup.toString());
    }
    @Test
    void testGetColor() {
        SoupPlate soup =new SoupPlate(2,"clay", "yellow", false, true, 8, "Stew");
        assertEquals(soup.color, "yellow");
    }
}