package org.db;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        Main.main(new String[]{});
        assertTrue(outContent.toString().contains("Hello and welcome!"));
    }

    @Test
    public void shouldPrintNumbersFromOneToFive() {
        Main.main(new String[]{});
        String[] lines = outContent.toString().split("\n");
    }
}