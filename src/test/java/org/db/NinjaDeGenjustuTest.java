package org.db;

import org.db.model.NinjaDeGenjutsu;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NinjaDeGenjustuTest {

    @Test
    public void deveUsarJutsuDeGenjutsu() {
        NinjaDeGenjutsu ninja = new NinjaDeGenjutsu("Itachi Uchiha", 21, "Konoha", "Tsukuyomi");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ninja.usarJutsu();

        assertTrue(outContent.toString().contains("Ninja de Genjutsu Itachi Uchiha está usando um jutsu de Genjutsu!"));

        System.setOut(System.out);
    }

    @Test
    public void deveDesviarComGenjutsu() {
        NinjaDeGenjutsu ninja = new NinjaDeGenjutsu("Itachi Uchiha", 21, "Konoha", "Tsukuyomi");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ninja.usarJutsu();

        assertTrue(outContent.toString().contains("Ninja de Genjutsu Itachi Uchiha está usando um jutsu de Genjutsu!"));

        System.setOut(System.out);
    }
}
