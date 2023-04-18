package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Plate {
    public static final double MAGIC_NUMBER = 1.8;
    protected int diameter;
    protected String material;
    protected String color;
    protected boolean isClean = false;
    protected boolean hasFood = false;
    public abstract double getMaxFoodWeight();

    public String getHeaders() {
        return String.join(",", "diameter", "material", "color", "isClean", "hasFood");
    }
    public String toCSV() {
        return String.format("%d,%s,%s,%b,%b", diameter, material, color, isClean, hasFood);
    }

    public String getColor() {
        return color;
    }
}
