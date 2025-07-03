package operadoresAritmeticos;

public class aula04 {
    public static void main(String[] args) {
        // + - / *

/*
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero02 + numero01;

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);
        boolean dezmenorquevinte = 10 < 20;
        System.out.println(dezmenorquevinte);
        boolean igual = 10 == 20;
        System.out.println(igual);
        boolean diferente = 10 != 20;
        System.out.println(diferente);
*/

        // || &&
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = salario > 4613 && idade > 30;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario < 4612;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);


    }


}
