package org.db.model;

public class NinjaDeNinjutsu extends Personagem{

    public NinjaDeNinjutsu(String nome, int idade, String aldeia, String primeiroJutsu) {
        super(nome, idade, aldeia, primeiroJutsu);
    }

    @Override
    public String toString() {
        return String.format("NinjaDeNinjutsu{nome='%s', idade=%d, aldeia='%s', jutsus=%s, chakra=%d}",
                super.getNome(), super.getIdade(), super.getAldeia(), super.getJutsus(), super.getChakra());
    }

    @Override
    public void usarJutsu() {
        System.out.printf("Ninja de Ninjutsu %s está usando um jutsu de Ninjutsu!", super.getNome());
    }

    @Override
    public void desviar() {
        System.out.printf("\nNinja de Ninjutsu %s está desviando de um ataque com sua habilidade de Ninjutsu!", super.getNome());
    }
}
