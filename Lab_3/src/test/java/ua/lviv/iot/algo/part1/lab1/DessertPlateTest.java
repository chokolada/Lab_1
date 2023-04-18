package ua.lviv.iot.algo.part1.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DessertPlateTest {

    @BeforeEach
    public void setUp() {
        Plate plate1;
        Plate plate2;
        plate1 = new DessertPlate(5, "clay", "blue", false, false, "ice cream", "chocolate");
        plate2 = new DessertPlate(4, "marble", "pink", true, false, "biscuit", "chocolate");
    }
    @Test
    void testToString() {
        DessertPlate dessert = new DessertPlate(5, "clay", "blue", false, false, "ice cream", "chocolate");
        assertEquals("DessertPlate{" +
                "DessertOnThePlate='" + "ice cream" + '\'' +
                ", topping='" + "chocolate" + '\'' +
                ", diameter=" + 5 +
                ", material='" + "clay" + '\'' +
                ", color='" + "blue" + '\'' +
                ", isClean=" + false +
                ", hasFood=" + false +
                '}', dessert.toString());
    }

    @Test
    void testGetMaxFoodWeight() {
        Plate plate;
        plate = new DessertPlate(5, "clay", "blue", false, false, "ice cream", "chocolate");
        assertEquals(11.309733552923255, plate.getMaxFoodWeight());
    }
}
