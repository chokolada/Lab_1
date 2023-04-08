package ua.lviv.iot.algo.part1.lab1;

public class SaladPlate extends Plate{
    private String plateType;
    private boolean canBeUsedInScullion;
    public SaladPlate(int diameter, String material, String color, boolean isClean, boolean hasFood, String plateType, boolean canBeUsedInScullion) {
        super(diameter, material, color, isClean, hasFood);
        this.plateType = plateType;
        this.canBeUsedInScullion = canBeUsedInScullion;
    }
    @Override
    public double getMaxFoodWeight() {
        double result = (Math.PI * (diameter/2) * (diameter/2) * (diameter/2))/3;
        return result;
    }

    @Override
    public String toString() {
        return "SaladPlate{" +
                "plateType='" + plateType + '\'' +
                ", canBeUsedInScullion=" + canBeUsedInScullion +
                ", diameter=" + diameter +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", isClean=" + isClean +
                ", hasFood=" + hasFood +
                '}';
    }
}
