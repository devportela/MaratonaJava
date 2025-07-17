package POO.associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite seu nome abaixo:");
        String nome = input.nextLine();
        System.out.println("digite sua idade:");
        int idade = input.nextInt();
        System.out.println("digite M ou F para sexo");
        char sexo = input.next().charAt(0);
        System.out.println("-----------------------");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);

    }
}
