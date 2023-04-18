package ua.lviv.iot.algo.part1.lab1;

public class MeatPlate extends Plate {
    private final int height;
    private final String meatInPlate;

    public MeatPlate(final int diameter,final String material,final String color,
                     final boolean isClean, final boolean hasFood,final int height,
                     final String meatInPlate) {
        super(diameter, material, color, isClean, hasFood);
        this.height = height;
        this.meatInPlate = meatInPlate;
    }

    @Override
    public double getMaxFoodWeight() {
        return (double) diameter * (double) diameter * (double) height;
    }

    public String getHeaders() {
        return "MeatPlate," + super.getHeaders() + ',' + "height" + "," + "meatInPlate";
    }


    public String toCSV() {
        return "MeatPlate," + super.toCSV() + String.format(",%d,%s", height, meatInPlate);
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
