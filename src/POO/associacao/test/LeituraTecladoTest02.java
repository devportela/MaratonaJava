package POO.associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("o grande software de previsao do futuro");
        System.out.println("digite sua pergunta e eu responderei SIM OU NAO");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        }else{
            System.out.println("NAO");
        }
    }
}

