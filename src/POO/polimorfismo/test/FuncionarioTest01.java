package POO.polimorfismo.test;

import POO.polimorfismo.domain.Desenvolvedor;
import POO.polimorfismo.domain.Funcionario;
import POO.polimorfismo.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Desenvolvedor();
        Funcionario funcionario2 = new Gerente();

        funcionario1.calcularSalario();
        System.out.println("--------------");
        funcionario2.calcularSalario();

    }
}
