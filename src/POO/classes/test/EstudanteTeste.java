package POO.classes.test;

import POO.classes.domain.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //criando um objeto com a classe estudante

        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
