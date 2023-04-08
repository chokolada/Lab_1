package ua.lviv.iot.algo.part1.lab1;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@ToString
public class PlateManager {
    private List<Plate> plates = new LinkedList<>();
    public void addPlate(Plate plate) {
        plates.addAll(List.of(plate));
    };
    public void findAllWithWeightGreaterThan(int searchedWeight) {
        List<Plate> filtredPlates = plates.stream().
                filter(weight -> weight.getMaxFoodWeight() > searchedWeight).
                collect(Collectors.toList());
        for (Plate plate: filtredPlates) {
            System.out.println("Weight searched plate->" + plate);
        }
    };
    public void findAllPlatesWithColor(String searchedColor){
        List<Plate> filtredPlates = plates.stream().
                filter(color -> color.getColor() == searchedColor).
                collect(Collectors.toList());
        for (Plate plate: filtredPlates) {
            System.out.println("Color searched plate->" + plate);
        }

    }
    public static void main(String[] args) {
        PlateManager plateManager = new PlateManager();
        plateManager.addPlate(new SoupPlate(2,"clay", "yellow", false, true, 8, "Stew"));
        plateManager.addPlate(new SoupPlate(7,"marble", "orange", true, false, 4, "Borsch"));
        plateManager.addPlate(new SaladPlate(10,"marble", "red", true, false, "round", false));
        plateManager.addPlate(new SaladPlate(12,"iron", "purple", false, false, "oval", true));
        plateManager.addPlate(new MeatPlate(20, "steel", "white", false,true, 10, "chicken"));
        plateManager.addPlate(new MeatPlate(18, "clay", "black", true,true, 12, "beef"));
        plateManager.addPlate(new DessertPlate(5,"clay", "blue", false, false, "ice cream",  "chocolate"));
        plateManager.addPlate(new DessertPlate(4,"marble", "pink", true, false, "biscuit",  "chocolate"));
        for(Plate plate: plateManager.plates) {
            System.out.println(plate);
        }
        plateManager.findAllWithWeightGreaterThan(100);
        plateManager.findAllPlatesWithColor("white");
}
}
