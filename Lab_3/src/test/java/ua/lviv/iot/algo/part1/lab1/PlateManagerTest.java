package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateManagerTest {
    PlateManager plateManager;

    @BeforeEach
    public void setUp() {
        plateManager = new PlateManager();
        plateManager.addPlate(new SoupPlate(2, "clay", "yellow", false, true, 8, "Stew"));
        plateManager.addPlate(new SoupPlate(7, "marble", "orange", true, false, 4, "Borsch"));
        plateManager.addPlate(new SaladPlate(10, "marble", "red", true, false, "round", false));
        plateManager.addPlate(new SaladPlate(12, "iron", "purple", false, false, "oval", true));
        plateManager.addPlate(new MeatPlate(20, "steel", "white", false, true, 10, "chicken"));
        plateManager.addPlate(new MeatPlate(18, "clay", "black", true, true, 12, "beef"));
        plateManager.addPlate(new DessertPlate(5, "clay", "blue", false, false, "ice cream", "chocolate"));
        plateManager.addPlate(new DessertPlate(4, "marble", "pink", true, false, "biscuit", "chocolate"));
    }

    @Test
    public void addPlate() {
        var result = plateManager.getPlates().size();
        assertEquals(8, result);
    }

    @Test
    public void findAllWithWeightGreaterThan() {
        var result = plateManager.findAllWithWeightGreaterThan(100);
        assertEquals(5, result.size());
        for (var plates : result) {
            assertTrue(plates.getMaxFoodWeight() > 100);
        }
    }

    @Test
    public void findAllPlatesWithColor() {
        var result = plateManager.findAllPlatesWithColor("white");
        assertEquals(1, plateManager.findAllPlatesWithColor("white").size());
        for (var plates : result) {
            assertEquals("white", plates.getColor());
        }
    }

}