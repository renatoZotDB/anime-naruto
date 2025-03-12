package org.db.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Personagem implements Ninja {
    private String nome;
    private int idade;
    private String aldeia;
    private List<String> jutsus;
    private int chakra;

    public Personagem(String nome, int idade, String aldeia, String primeiroJutsu) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.jutsus = new ArrayList<>(List.of(primeiroJutsu));
        System.out.printf("Ninja criado: Nome = %s, Idade = %d, Aldeia = %s%n", nome, idade, aldeia);
    }

    @Override
    public void usarJutsu() {
        Random random = new Random();
        System.out.printf("\nUsando jutsu: %s%n", jutsus.get(random.nextInt(jutsus.size())));
    }

    @Override
    public void desviar() {
        System.out.println("Desviando de um ataque");
    }


    public void adicionarJutsu (String novoJutsu) {
        jutsus.add(novoJutsu);
    }

    public void aumentarChakra (int incrementoDeChakra) {
        this.chakra += incrementoDeChakra;
    }

    public String getInfo() {
        return toString();
    }

    public String toString() {
        return String.format("Personagem{nome='%s', idade=%d, aldeia='%s', jutsus=%s, chakra=%d}",
                nome, idade, aldeia, jutsus, chakra);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public List<String> getJutsus() {
        return jutsus;
    }

    public void setJutsus(List<String> jutsus) {
        this.jutsus = jutsus;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
}
