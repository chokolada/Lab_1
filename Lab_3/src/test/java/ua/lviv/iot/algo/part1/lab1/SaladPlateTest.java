package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SaladPlateTest {
    @BeforeEach
    public void setUp() {
        Plate plate1;
        Plate plate2;
        plate1 = new SaladPlate(10, "marble", "red", true, false, "round", false);
        plate2 = new SaladPlate(12, "iron", "purple", false, false, "oval", true);
    }
    @Test
    void testToString() {
        SaladPlate salad = new SaladPlate(10, "marble", "red", true, false, "round", false);
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
    void testGetMaxFoodWeight() {
        Plate plate;
        plate = new SaladPlate(10, "marble", "red", true, false, "round", false);
        assertEquals(130.89969389957471, plate.getMaxFoodWeight());
    }
}
