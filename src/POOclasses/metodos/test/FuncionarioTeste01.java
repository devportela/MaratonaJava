package POOclasses.metodos.test;

import POOclasses.metodos.domain.Funcionario;
import POOclasses.metodos.domain.MediaSalarial;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        MediaSalarial media = new MediaSalarial();
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();


        funcionario01.nome = "Gustavo";
        funcionario01.idade = 16;
        funcionario01.salario = 5500;

        funcionario02.nome = "José";
        funcionario02.idade = 43;
        funcionario02.salario = 3500;

        funcionario03.nome = "Junior ";
        funcionario03.idade = 28;
        funcionario03.salario = 4500;

        funcionario01.imprimeDados();
        funcionario02.imprimeDados();
        funcionario03.imprimeDados();

        media.mediaSalarioFuncionario(funcionario01.salario,funcionario02.salario, funcionario03.salario);










    }
}
