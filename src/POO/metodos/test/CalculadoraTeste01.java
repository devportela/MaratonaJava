package POO.metodos.test;

import POO.metodos.domain.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("finalizando CalculadoraTeste01");
        calc.subtraiDoisNumeros();
    }
}
