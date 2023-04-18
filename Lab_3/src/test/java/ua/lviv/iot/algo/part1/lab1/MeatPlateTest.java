package ua.lviv.iot.algo.part1.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MeatPlateTest {
    @BeforeEach
    public void setUp() {
        Plate plate1;
        Plate plate2;
        plate1 = new MeatPlate(20, "steel", "white", false, true, 10, "chicken");
        plate2 = new MeatPlate(18, "clay", "black", true, true, 12, "beef");
    }

    @Test
    void testToString() {
        MeatPlate meat = new MeatPlate(20, "steel", "white", false, true, 10, "chicken");
        assertEquals("MeatPlate{"
                + "height=" + 10
                + ", meatInPlate='" + "chicken" + '\''
                + ", diameter=" + 20
                + ", material='" + "steel" + '\''
                + ", color='" + "white" + '\''
                + ", isClean=" + false
                + ", hasFood=" + true
                + '}', meat.toString());
    }
    @Test
    void testGetMaxFoodWeight() {
        Plate plate;
        plate = new MeatPlate(20, "steel", "white", false, true, 10, "chicken");
        assertEquals(4000, plate.getMaxFoodWeight());
    }
}
