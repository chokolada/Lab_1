package ua.lviv.iot.algo.part1.lab1;


public class DessertPlate extends Plate {
    private final String dessertOnThePlate;
    private final String topping;

    public DessertPlate(final int diameter,final String material,final String color,
                        final boolean isClean,final boolean hasFood,
                        final String dessertOnThePlate, final String topping) {
        super(diameter, material, color, isClean, hasFood);
        this.dessertOnThePlate = dessertOnThePlate;
        this.topping = topping;
    }
    @Override
    public double getMaxFoodWeight() {
        double result = Math.PI * (double) (diameter / 2) * MAGIC_NUMBER;
        return result;
    }

    public String getHeaders() {
        return "DessertPlate," + super.getHeaders() + ',' + "dessertOnThePlate" + "," + "topping";
    }


    public String toCSV() {
        return "DessertPlate," + super.toCSV() + String.format(",%s,%s", dessertOnThePlate, topping);
    }

    @Override
    public String toString() {
        return "DessertPlate{" +
                "DessertOnThePlate='" + dessertOnThePlate + '\'' +
                ", topping='" + topping + '\'' +
                ", diameter=" + diameter +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", isClean=" + isClean +
                ", hasFood=" + hasFood +
                '}';
    }
}
