package ua.lviv.iot.algo.part1.lab1;
import lombok.*;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plate {
    private int diameter;
    private String material;
    private String color;
    private boolean isClean = false;
    private boolean hasFood = false;
    private static Plate instance = new Plate();
    public void wash() {
        isClean = true;
    }
    public void dirty() {
        isClean = false;
    }
    public void eat() {
        isClean = false;
        hasFood = false;
    }
    public void addFood() {
        hasFood = true;
    }
    public static Plate getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        Plate[] objectArray = {
        new Plate(),
        new Plate( 10, "mramor", "green", false, false),
        getInstance(),
        getInstance()};
        for (Plate plate : objectArray) {
            System.out.println(plate);
        }
    }
}