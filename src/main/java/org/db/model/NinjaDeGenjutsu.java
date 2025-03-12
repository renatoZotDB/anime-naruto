package org.db.model;

public class NinjaDeGenjutsu extends Personagem{

    public NinjaDeGenjutsu(String nome, int idade, String aldeia, String primeiroJutsu) {
        super(nome, idade, aldeia, primeiroJutsu);
    }

    @Override
    public String toString() {
        return String.format("NinjaDeGenjutsu{nome='%s', idade=%d, aldeia='%s', jutsus=%s, chakra=%d}",
                super.getNome(), super.getIdade(), super.getAldeia(), super.getJutsus(), super.getChakra());
    }

    @Override
    public void usarJutsu() {
        System.out.printf("Ninja de Genjutsu %s está usando um jutsu de Genjutsu!", super.getNome());
    }

    @Override
    public void desviar() {
        System.out.printf("\nNinja de Genjutsu %s está desviando de um ataque com sua habilidade de Genjutsu!", super.getNome());
    }
}
