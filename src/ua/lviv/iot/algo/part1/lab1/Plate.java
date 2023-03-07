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
        Plate[] objectArray = new Plate[4];
        objectArray[0] = new Plate();
        objectArray[1] = new Plate( 10, "mramor", "green", false, false);
        objectArray[2] = getInstance();
        objectArray[3] = getInstance();
        objectArray[1].wash();
        objectArray[1].dirty();
        objectArray[1].eat();

        for (int i = 0; i < objectArray.length; i++){
            System.out.println(objectArray[i]);
        }

    }
}