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
    public List<Plate> getPlates() {
        return plates;
    }

    public List<Plate> findAllWithWeightGreaterThan(int searchedWeight) {
        List<Plate> filtredPlates = plates.stream().
                filter(weight -> weight.getMaxFoodWeight() > searchedWeight).
                collect(Collectors.toList());
        for (Plate plate: filtredPlates) {
            System.out.println("Weight searched plate->" + plate);
        }
        return filtredPlates;
    };
    public List<Plate> findAllPlatesWithColor(String searchedColor){
        List<Plate> filtredPlates = plates.stream().
                filter(color -> color.getColor() == searchedColor).
                collect(Collectors.toList());
        for (Plate plate: filtredPlates) {
            System.out.println("Color searched plate->" + plate);
        }
        return filtredPlates;
    }
}
