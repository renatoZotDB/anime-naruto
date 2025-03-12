package org.db;

import org.db.model.Personagem;
import org.junit.jupiter.api.Test;

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
}
