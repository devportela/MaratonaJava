package POO.associacao.test;

import POO.associacao.domain.Escola;
import POO.associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor  = new Professor("Gustavo");
        Professor[] professores = {professor};

        Escola escola = new Escola(professores,"Emef Solano Trindade");

        escola.imprime();

    }
}
