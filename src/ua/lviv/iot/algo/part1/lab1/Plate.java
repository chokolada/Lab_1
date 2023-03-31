package ua.lviv.iot.algo.part1.lab1;
import lombok.*;
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Plate{
    protected int diameter;
    protected String material;
    protected String color;
    protected boolean isClean = false;
    protected boolean hasFood = false;
    public abstract double getMaxFoodWeight();

    public String getColor() {
        return color;
    }
}
