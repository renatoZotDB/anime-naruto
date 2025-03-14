package org.db;

import org.db.model.Personagem;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {

    @Test
    void deveCriarInstancia() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");

        assertNotNull(personagem.getNome());
        assertEquals("Naruto", personagem.getNome());
        assertEquals(17, personagem.getIdade());
        assertEquals("Konoha", personagem.getAldeia());
        assertTrue(personagem.getJutsus().contains("Rasengan"));
    }

    @Test
    void deveAdicionarJutsu() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");

        personagem.adicionarJutsu("Kage Bunshin no Jutsu");

        assertTrue(personagem.getJutsus().contains("Kage Bunshin no Jutsu"));
    }

    @Test
    void deveAdicionarChakra() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");

        personagem.aumentarChakra(100);

        assertEquals(100, personagem.getChakra());
    }

    @Test
    void deveExibirInformacoes() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");

        String informacoes = personagem.getInfo();

        assertTrue(informacoes.contains("Naruto"));
        assertTrue(informacoes.contains("17"));
        assertTrue(informacoes.contains("Konoha"));
        assertTrue(informacoes.contains("Rasengan"));
    }

    @Test
    void deveRetornarStringFormatada() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        assertTrue(personagem.toString().contains("Personagem{nome='Naruto', idade=17, aldeia='Konoha'"));
    }

    @Test
    void deveDesviarDeUmAtaque() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        personagem.desviar();
        assertTrue(outContent.toString().contains("Desviando de um ataque"));
    }

    @Test
    void deveUsarJutsu() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        personagem.usarJutsu();
        assertTrue(outContent.toString().contains("Usando jutsu"));
    }

    @Test
    void deveRetornarNome() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        assertEquals("Naruto", personagem.getNome());
    }

    @Test
    void deveRetornarIdade() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        assertEquals(17, personagem.getIdade());
    }

    @Test
    void deveRetornarAldeia() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        assertEquals("Konoha", personagem.getAldeia());
    }

    @Test
    void deveRetornarJutsus() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        assertTrue(personagem.getJutsus().contains("Rasengan"));
    }

    @Test
    void deveRetornarChakra() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        assertEquals(0, personagem.getChakra());
    }

    @Test
    void deveAlterarNome() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        personagem.setNome("Sasuke");
        assertEquals("Sasuke", personagem.getNome());
    }

    @Test
    void deveAlterarIdade() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        personagem.setIdade(18);
        assertEquals(18, personagem.getIdade());
    }

    @Test
    void deveAlterarAldeia() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        personagem.setAldeia("Sunagakure");
        assertEquals("Sunagakure", personagem.getAldeia());
    }

    @Test
    void deveAlterarJutsus() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        personagem.setJutsus(List.of("Kage Bunshin no Jutsu"));
        assertTrue(personagem.getJutsus().contains("Kage Bunshin no Jutsu"));
    }

    @Test
    void deveAlterarChakra() {
        Personagem personagem = new Personagem("Naruto", 17, "Konoha", "Rasengan");
        personagem.setChakra(100);
        assertEquals(100, personagem.getChakra());
    }
}
