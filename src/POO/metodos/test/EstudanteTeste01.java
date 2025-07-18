package POO.metodos.test;

import POO.metodos.domain.Estudante;
import POO.metodos.domain.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressEstudante = new ImpressoraEstudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println("----------------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
//-------------------------------------------------//


        //imprimindo passsando como parametro a variavel de referencia estudante//
        impressEstudante.imprimeEstudante(estudante1);
        impressEstudante.imprimeEstudante(estudante2);
        System.out.println("----------------------");
        impressEstudante.imprimeEstudante(estudante1);
        impressEstudante.imprimeEstudante(estudante2);


    }

}
