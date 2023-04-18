package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PlateWriter {
    public String writeToFile(List<Plate> plates, String fileName) throws IOException { // Може в результаті роботи викинути виняткову ситуацію в цьому випадку IOException
        if (plates.isEmpty()) {
            return null;
        } else {
            File resultFile = new File(fileName);
            try (PrintWriter writer = new PrintWriter(resultFile)){
                Plate typeOfThePlate = plates.get(0);
                writer.println(typeOfThePlate.getHeaders());
                for (var plate : plates) {
                    if (typeOfThePlate.getClass() != plate.getClass()) {
                        typeOfThePlate = plate;
                        writer.println(plate.getHeaders());
                    }
                    writer.println(plate.toCSV());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileName;
    } // catch-якщо зловили Exception виконуєм цей блок;
        // finally - це той блок що обов'язково виконається
}
