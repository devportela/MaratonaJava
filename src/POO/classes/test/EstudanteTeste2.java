package POO.classes.test;

import POO.classes.domain.Estudante;

public class EstudanteTeste2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante(); // a var de referencia esta fazendo referencia pra mesma classe nas duas situacoes,o resultado imprimido é o mesmo;


        System.out.println(estudante.nome);
        System.out.println(estudante2.nome);


    }
}
