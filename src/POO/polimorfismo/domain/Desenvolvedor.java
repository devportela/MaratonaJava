package POO.polimorfismo.domain;

public class Desenvolvedor extends Funcionario {
    @Override
    public void calcularSalario() {
        System.out.println("salario de 50000");
    }
}
