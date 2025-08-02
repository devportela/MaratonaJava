package POO.polimorfismo.test;

import POO.polimorfismo.domain.Computador;
import POO.polimorfismo.domain.Produto;
import POO.polimorfismo.domain.Tomate;
import POO.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    //analogia do controle remoto,para entender como funciona o polimorfismo
    //variavel de refencia controle samsung 2019 faz referencia a tv samsung 2019,mas tambem a variavel de referencia pode funcionar na tv sansung 2020
    //quem executa é sempre o objeto,no caso computador e tomate

    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/10/2025");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(produto);


    }
}
