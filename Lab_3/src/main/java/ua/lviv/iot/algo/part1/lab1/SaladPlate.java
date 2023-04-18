package ua.lviv.iot.algo.part1.lab1;

public class SaladPlate extends Plate {
    private String plateType;
    private boolean canBeUsedInScullion;

    public SaladPlate(final int diameter,final String material,final String color,
                      final boolean isClean, final boolean hasFood,
                      final String plateType,final boolean canBeUsedInScullion) {
        super(diameter, material, color, isClean, hasFood);
        this.plateType = plateType;
        this.canBeUsedInScullion = canBeUsedInScullion;
    }

    @Override
    public double getMaxFoodWeight() {
        double result = (Math.PI * (diameter / 2) * (diameter / 2) * (diameter / 2)) / 3;
        return result;
    }

    public String getHeaders() {
        return "SaladPlate," + super.getHeaders() + ',' + "plateType" + "," + "canBeUsedInScullion";
    }


    public String toCSV() {
        return "SaladPlate" + super.toCSV() + String.format(",%s,%b", plateType, canBeUsedInScullion);
    };

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
