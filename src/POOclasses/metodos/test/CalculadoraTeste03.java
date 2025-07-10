package POOclasses.metodos.test;

import POOclasses.metodos.domain.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double resultado =  calc.divideDoisNumeros(20,0);
        System.out.println(resultado);

    }
}
