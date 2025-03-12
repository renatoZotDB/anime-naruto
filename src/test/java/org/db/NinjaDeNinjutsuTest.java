package org.db;

import org.db.model.NinjaDeNinjutsu;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NinjaDeNinjutsuTest {

    @Test
    public void deveUsarJutsuDeNinjutsu() {
        NinjaDeNinjutsu ninja = new NinjaDeNinjutsu("Naruto", 17, "Konoha", "Rasengan");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ninja.usarJutsu();

        assertTrue(outContent.toString().contains("Ninja de Ninjutsu Naruto está usando um jutsu de Ninjutsu!"));

        System.setOut(System.out);
    }

    @Test
    public void deveDesviarComNinjutsu() {
        NinjaDeNinjutsu ninja = new NinjaDeNinjutsu("Naruto", 17, "Konoha", "Rasengan");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ninja.desviar();

        assertTrue(outContent.toString().contains("Ninja de Ninjutsu Naruto está desviando de um ataque com sua habilidade de Ninjutsu!"));

        System.setOut(System.out);
    }
}
