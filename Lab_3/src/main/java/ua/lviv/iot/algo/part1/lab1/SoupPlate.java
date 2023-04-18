package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SoupPlate extends Plate {
    private int deepnessInSm;
    private String soupType;

    public SoupPlate(final int diameter,final String material,final String color,
                     final boolean isClean,final boolean hasFood,
                     final int deepnessInSm, String soupType) {
        super(diameter, material, color, isClean, hasFood);
        this.deepnessInSm = deepnessInSm;
        this.soupType = soupType;
    }

    @Override
    public double getMaxFoodWeight() {
        return Math.PI * ((double) diameter / 2) * ((double) diameter / 2) * deepnessInSm;
    }
    public String getHeaders() {
        return "SoupPlate," + super.getHeaders() + ',' + "deepnessInSm" + "," + "soupType";
    }


    public String toCSV() {
        return "SoupPlate," + super.toCSV() + String.format(",%d,%s", deepnessInSm, soupType);
    }


    @Override
    public String toString() {
        return "SoupPlate{"
                + "deepnessInSm=" + deepnessInSm
                + ", soupType='" + soupType + '\''
                + ", diameter=" + diameter
                + ", material='" + material + '\''
                + ", color='" + color + '\''
                + ", isClean=" + isClean
                + ", hasFood=" + hasFood
                + '}';
    }
}
