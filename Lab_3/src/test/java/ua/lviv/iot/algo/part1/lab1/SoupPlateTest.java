package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SoupPlateTest {
    @BeforeEach
        @Test
    void testToString() {
        SoupPlate soup = new SoupPlate(2, "clay", "yellow", false, true, 8, "Stew");
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
    void testGetMaxFoodWeight() {
        Plate plate;
        plate = new SoupPlate(2, "clay", "yellow", false, true, 8, "Stew");
        assertEquals(25.132741228718345, plate.getMaxFoodWeight());
    }
}
