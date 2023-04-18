package ua.lviv.iot.algo.part1.lab1;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class PlateWriterTest {
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";
    private PlateManager plateManager;
    private PlateWriter writer;
    @BeforeEach
    public void setUp() {
        writer = new PlateWriter();
        plateManager = new PlateManager();
        plateManager.addPlate(new SoupPlate(2, "clay", "yellow", false, true, 8, "Stew"));
        plateManager.addPlate(new SoupPlate(7, "marble", "orange", true, false, 4, "Borsch"));
        plateManager.addPlate(new SaladPlate(10, "marble", "red", true, false, "round", false));
        plateManager.addPlate(new SaladPlate(12, "iron", "purple", false, false, "oval", true));
        plateManager.addPlate(new MeatPlate(20, "steel", "white", false, true, 10, "chicken"));
        plateManager.addPlate(new MeatPlate(18, "clay", "black", true, true, 12, "beef"));
        plateManager.addPlate(new DessertPlate(5, "clay", "blue", false, false, "ice cream", "chocolate"));
        plateManager.addPlate(new DessertPlate(4, "marble", "pink", true, false, "biscuit", "chocolate"));

    }

    @After
    public void tearDown() {

    }

    @Test
    void testWriteToFile() throws IOException {
        Path expected = new File(RESULT_FILENAME).toPath();
        Path result = new File(EXPECTED_FILENAME).toPath();
        writer.writeToFile(plateManager.getSortedPlatesList(), RESULT_FILENAME);

        assertEquals(-1L, Files.mismatch(expected, result));
    }
}