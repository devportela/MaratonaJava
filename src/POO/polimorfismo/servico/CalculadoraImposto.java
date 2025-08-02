package POO.polimorfismo.servico;

import POO.polimorfismo.domain.Computador;
import POO.polimorfismo.domain.Produto;
import POO.polimorfismo.domain.Tomate;


public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        //passando como parametro um objeto do TIPO PRODUTO
        System.out.println("Relatório de imposto:");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("imposto: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            ((Tomate) produto).getDataValidade();
            System.out.println(tomate.getDataValidade());
        }
    }
}
