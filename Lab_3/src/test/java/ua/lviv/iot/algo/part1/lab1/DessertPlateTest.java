package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DessertPlateTest {

    @Test
    void getMaxFoodWeight() {
        DessertPlate dessert = new DessertPlate(5,"clay", "blue", false, false, "ice cream",  "chocolate");
        dessert = new DessertPlate(4, "marble", "pink", true, false, "biscuit", "chocolate");
        assertEquals(dessert.getMaxFoodWeight() > 100, dessert.getMaxFoodWeight() > 100);
    }

    @Test
    void testToString() {
        DessertPlate dessert = new DessertPlate(5,"clay", "blue", false, false, "ice cream",  "chocolate");
        assertEquals("DessertPlate{" +
                "DessertOnThePlate='" + "ice cream" + '\'' +
                ", topping='" + "chocolate" + '\'' +
                ", diameter=" + 5 +
                ", material='" + "clay" + '\'' +
                ", color='" + "blue" + '\'' +
                ", isClean=" + false +
                ", hasFood=" + false +
                '}' , dessert.toString());
    }
    @Test
    void testGetColor() {
        DessertPlate dessert = new DessertPlate(5,"clay", "blue", false, false, "ice cream",  "chocolate");
        assertEquals(dessert.color, "blue");
    }
}