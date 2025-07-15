package POO.sobrecargaDeMetodos.test;

import POO.sobrecargaDeMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV",12);
        anime.init("Akudama Drive 2","TV",12,"Acao");
        anime.setGenero("Ação");
        anime.imprime();
    }
}
