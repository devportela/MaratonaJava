package POO.classes.test;

import POO.classes.domain.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "mestre kami";
        professor.idade = 56;
        professor.sexo = 'M';

        System.out.print("nome: " + professor.nome + "idade" + professor.idade + "sexo" + professor.sexo);
    }
}
