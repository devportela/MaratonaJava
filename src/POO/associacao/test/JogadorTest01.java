package POO.associacao.test;

import POO.associacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("ronaldo");
        Jogador jogador2 = new Jogador("romario");
        Jogador jogador3 = new Jogador("cafu");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
