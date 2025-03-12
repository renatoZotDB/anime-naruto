package org.db.model;

public class NinjaDeTaijutsu extends Personagem {

    public NinjaDeTaijutsu(String nome, int idade, String aldeia, String primeiroJutsu) {
        super(nome, idade, aldeia, primeiroJutsu);
    }

    @Override
    public String toString() {
        return String.format("NinjaDeTaijutsu{nome='%s', idade=%d, aldeia='%s', jutsus=%s, chakra=%d}",
                super.getNome(), super.getIdade(), super.getAldeia(), super.getJutsus(), super.getChakra());
    }

    @Override
    public void usarJutsu() {
        System.out.printf("Ninja de Taijutsu %s está atacando com um golpe de Taijutsu!", super.getNome());
    }

    @Override
    public void desviar() {
        System.out.printf("\nNinja de Taijutsu %s está desviando de um ataque com sua habilidade de Taijutsu!", super.getNome());
    }
}
