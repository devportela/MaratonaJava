package POO.metodos.domain;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }


    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);


    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("nao existe divisao por zero");
        }
        return num1 / num2;
    }


    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("NUM1" + numero1);
        System.out.println("NUM2" + numero2);

    }


    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {

        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);

    }


}
