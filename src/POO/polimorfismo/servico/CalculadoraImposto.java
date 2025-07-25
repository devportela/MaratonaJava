package POO.polimorfismo.servico;

import POO.polimorfismo.domain.Computador;
import POO.polimorfismo.domain.Tomate;
import org.jetbrains.annotations.NotNull;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("relatorio De Imposto Do Computador");
        double imposto = computador.calcularImposto();
        System.out.println(" computador:" + computador.getNome());
        System.out.println("valor do computador:" + computador.getValor());
        System.out.println("imposto do computador:" + imposto);

    }


    public static void calcularImpostoTomate(@NotNull Tomate tomate) {
        System.out.println("relatorio De Imposto Do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println(" tomate:" + tomate.getNome());
        System.out.println("valor do tomate:" + tomate.getValor());
        System.out.println("imposto do tomate:" + imposto);

    }

}
