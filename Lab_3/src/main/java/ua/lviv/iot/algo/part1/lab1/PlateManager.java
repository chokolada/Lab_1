package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.ToString;

@ToString
public class PlateManager {
    private final List<Plate> plates = new LinkedList<>();

    public void addPlate(Plate plate) {
        plates.add(plate);
    }

    public List<Plate> getPlates() {
        return new ArrayList<>(plates);
    }

    public List<Plate> findAllWithWeightGreaterThan(final int searchedWeight) {
        List<Plate> filtredPlates = plates.stream().
                filter(weight -> weight.getMaxFoodWeight() > searchedWeight).
                collect(Collectors.toList());
        for (Plate plate : filtredPlates) {
            System.out.println("Weight searched plate->" + plate);
        }
        return filtredPlates;
    }


    public List<Plate> findAllPlatesWithColor(final String searchedColor) {
        List<Plate> filtredPlates = plates.stream().
                filter(color -> color.getColor().equals(searchedColor)).
                collect(Collectors.toList());
        for (Plate plate : filtredPlates) {
            System.out.println("Color searched plate->" + plate);
        }
        return filtredPlates;
    }

    public List<Plate> getSortedPlatesList() {
        return plates.stream()
                .sorted(Comparator.comparingInt(laptop -> {
                    if (laptop instanceof MeatPlate) {
                        return 0;
                    } else if (laptop instanceof DessertPlate) {
                        return 1;
                    } else if (laptop instanceof SoupPlate) {
                        return 2;
                    } else if (laptop instanceof SaladPlate) {
                        return 3;
                    } else {
                        return 4;
                    }
                }))
                .toList();
    }
}
