package org.db;

import org.db.model.NinjaDeTaijutsu;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NinjaDeTaijutsuTest {

    @Test
    public void deveUsarJutsuDeTaijutsu() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Rock Lee", 17, "Konoha", "Konoha Senpuu");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ninja.usarJutsu();

        assertTrue(outContent.toString().contains("Ninja de Taijutsu Rock Lee está atacando com um golpe de Taijutsu!"));

        System.setOut(System.out);
    }

    @Test
    public void deveDesviarComTaijutsu() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Rock Lee", 17, "Konoha", "Konoha Senpuu");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ninja.desviar();

        assertTrue(outContent.toString().contains("Ninja de Taijutsu Rock Lee está desviando de um ataque com sua habilidade de Taijutsu!"));

        System.setOut(System.out);
    }

    @Test
    public void deveRetornarStringFormatada() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Rock Lee", 17, "Konoha", "Konoha Senpuu");
        assertTrue(ninja.toString().contains("NinjaDeTaijutsu{nome='Rock Lee', idade=17, aldeia='Konoha'"));
    }

}
