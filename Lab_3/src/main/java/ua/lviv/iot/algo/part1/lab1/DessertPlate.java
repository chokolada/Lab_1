package ua.lviv.iot.algo.part1.lab1;
public class DessertPlate extends Plate{
    private String DessertOnThePlate;
    private String topping;

    public DessertPlate(int diameter, String material, String color, boolean isClean, boolean hasFood, String dessertOnThePlate, String topping) {
        super(diameter, material, color, isClean, hasFood);
        DessertOnThePlate = dessertOnThePlate;
        this.topping = topping;
    }

    @Override
    public double getMaxFoodWeight() {
        double result = Math.PI * (diameter/2) * 1.8;
        return result;
    }
    @Override
    public String toString() {
        return "DessertPlate{" +
                "DessertOnThePlate='" + DessertOnThePlate + '\'' +
                ", topping='" + topping + '\'' +
                ", diameter=" + diameter +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", isClean=" + isClean +
                ", hasFood=" + hasFood +
                '}';
    }
}
