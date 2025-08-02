package POO.polimorfismo.test;

import POO.polimorfismo.domain.Computador;
import POO.polimorfismo.domain.Televisao;
import POO.polimorfismo.domain.Tomate;
import POO.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC1017", 11000);
        Tomate tomate = new Tomate("Tomate Verde", 10);
        Televisao tv= new Televisao("samsung 50",5000);
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tv);

    }
}
