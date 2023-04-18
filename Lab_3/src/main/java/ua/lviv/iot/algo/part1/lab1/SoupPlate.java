package ua.lviv.iot.algo.part1.lab1;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SoupPlate extends Plate{
    private int deepnessInSm;
    private String soupType;

    public SoupPlate(int diameter, String material, String color, boolean isClean, boolean hasFood, int deepnessInSm, String soupType) {
        super(diameter, material, color, isClean, hasFood);
        this.deepnessInSm = deepnessInSm;
        this.soupType = soupType;
    }
    @Override
    public double getMaxFoodWeight() {
        double result = Math.PI * (diameter/2) * (diameter/2) * deepnessInSm;
        return result;
    }

    @Override
    public String toString() {
        return "SoupPlate{" +
                "deepnessInSm=" + deepnessInSm +
                ", soupType='" + soupType + '\'' +
                ", diameter=" + diameter +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", isClean=" + isClean +
                ", hasFood=" + hasFood +
                '}';
    }
}
