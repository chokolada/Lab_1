package ua.lviv.iot.algo.part1.lab1;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

class PlateManagerTest {
    @Test
    public void addPlate() {
        PlateManager plateManager = new PlateManager();
        plateManager.addPlate(new SoupPlate(2,"clay", "yellow", false, true, 8, "Stew"));
        plateManager.addPlate(new SoupPlate(7,"marble", "orange", true, false, 4, "Borsch"));
        plateManager.addPlate(new SaladPlate(10,"marble", "red", true, false, "round", false));
        plateManager.addPlate(new SaladPlate(12,"iron", "purple", false, false, "oval", true));
        plateManager.addPlate(new MeatPlate(20, "steel", "white", false,true, 10, "chicken"));
        plateManager.addPlate(new MeatPlate(18, "clay", "black", true,true, 12, "beef"));
        plateManager.addPlate(new DessertPlate(5,"clay", "blue", false, false, "ice cream",  "chocolate"));
        plateManager.addPlate(new DessertPlate(4,"marble", "pink", true, false, "biscuit",  "chocolate"));
        assertEquals(8, plateManager.getPlates().size());
    }

    @org.junit.jupiter.api.Test
    public void findAllWithWeightGreaterThan() {
        PlateManager plateManager = new PlateManager();
        plateManager.addPlate(new SoupPlate(2,"clay", "yellow", false, true, 8, "Stew"));
        plateManager.addPlate(new SoupPlate(7,"marble", "orange", true, false, 4, "Borsch"));
        plateManager.addPlate(new SaladPlate(10,"marble", "red", true, false, "round", false));
        plateManager.addPlate(new SaladPlate(12,"iron", "purple", false, false, "oval", true));
        plateManager.addPlate(new MeatPlate(20, "steel", "white", false,true, 10, "chicken"));
        plateManager.addPlate(new MeatPlate(18, "clay", "black", true,true, 12, "beef"));
        plateManager.addPlate(new DessertPlate(5,"clay", "blue", false, false, "ice cream",  "chocolate"));
        plateManager.addPlate(new DessertPlate(4,"marble", "pink", true, false, "biscuit",  "chocolate"));
        assertEquals(5, plateManager.findAllWithWeightGreaterThan(100).size());
    }

    @org.junit.jupiter.api.Test
    public void findAllPlatesWithColor() {
        PlateManager plateManager = new PlateManager();
        plateManager.addPlate(new SoupPlate(2,"clay", "yellow", false, true, 8, "Stew"));
        plateManager.addPlate(new SoupPlate(7,"marble", "orange", true, false, 4, "Borsch"));
        plateManager.addPlate(new SaladPlate(10,"marble", "red", true, false, "round", false));
        plateManager.addPlate(new SaladPlate(12,"iron", "purple", false, false, "oval", true));
        plateManager.addPlate(new MeatPlate(20, "steel", "white", false,true, 10, "chicken"));
        plateManager.addPlate(new MeatPlate(18, "clay", "black", true,true, 12, "beef"));
        plateManager.addPlate(new DessertPlate(5,"clay", "blue", false, false, "ice cream",  "chocolate"));
        plateManager.addPlate(new DessertPlate(4,"marble", "pink", true, false, "biscuit",  "chocolate"));
        assertEquals(1, plateManager.findAllPlatesWithColor("white").size());
    }
    @Test
    public void getPlates() {
        PlateManager plateManager = new PlateManager();
        plateManager.addPlate(new SoupPlate(2,"clay", "yellow", false, true, 8, "Stew"));
        plateManager.addPlate(new SoupPlate(7,"marble", "orange", true, false, 4, "Borsch"));
        plateManager.addPlate(new SaladPlate(10,"marble", "red", true, false, "round", false));
        plateManager.addPlate(new SaladPlate(12,"iron", "purple", false, false, "oval", true));
        plateManager.addPlate(new MeatPlate(20, "steel", "white", false,true, 10, "chicken"));
        plateManager.addPlate(new MeatPlate(18, "clay", "black", true,true, 12, "beef"));
        plateManager.addPlate(new DessertPlate(5,"clay", "blue", false, false, "ice cream",  "chocolate"));
        plateManager.addPlate(new DessertPlate(4,"marble", "pink", true, false, "biscuit",  "chocolate"));
        assertEquals(List.of(plateManager), plateManager);
    }
}