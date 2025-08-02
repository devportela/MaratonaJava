package POO.polimorfismo.domain;

public class Gerente extends Funcionario{
    @Override
    public void calcularSalario() {
        System.out.println("salario 10000");
    }

}
