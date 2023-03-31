package ua.lviv.iot.algo.part1.lab1;

public class MeatPlate extends Plate{
    private int height;
    private String meatInPlate;

    public MeatPlate(int diameter, String material, String color, boolean isClean, boolean hasFood, int height, String meatInPlate) {
        super(diameter, material, color, isClean, hasFood);
        this.height = height;
        this.meatInPlate = meatInPlate;
    }

    @Override
    public double getMaxFoodWeight() {
        return diameter * diameter * height;
    }

    @Override
    public String toString() {
        return "MeatPlate{" +
                "height=" + height +
                ", meatInPlate='" + meatInPlate + '\'' +
                ", diameter=" + diameter +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", isClean=" + isClean +
                ", hasFood=" + hasFood +
                '}';
    }
}
