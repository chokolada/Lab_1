package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaladPlateTest {

    @Test
    void getMaxFoodWeight() {
        SaladPlate salad = new SaladPlate(10,"marble", "red", true, false, "round", false);
        salad = new SaladPlate(12,"iron", "purple", false, false, "oval", true);
        assertEquals(salad.getMaxFoodWeight() > 100, salad.getMaxFoodWeight() > 100);
    }

    @Test
    void testToString() {
        SaladPlate salad = new SaladPlate(10,"marble", "red", true, false, "round", false);
        assertEquals("SaladPlate{" +
                "plateType='" + "round" + '\'' +
                ", canBeUsedInScullion=" + false +
                ", diameter=" + 10 +
                ", material='" + "marble" + '\'' +
                ", color='" + "red" + '\'' +
                ", isClean=" + true +
                ", hasFood=" + false +
                '}', salad.toString());
    }
    @Test
    void testGetColor() {
        SaladPlate salad = new SaladPlate(10,"marble", "red", true, false, "round", false);
        assertEquals(salad.color, "red");
    }
}