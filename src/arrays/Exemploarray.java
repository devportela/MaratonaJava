package arrays;

import java.util.Scanner;

public class Exemploarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero de posicoes do array: ");
        int valoresArray = sc.nextInt();
        String[]nomes = new String[valoresArray];
        for(int i = 0;i < nomes.length;i++){
            System.out.println("digite o nome para a posicao"+i);
            nomes[i] = sc.next();
            System.out.println("nome inserido: "+nomes[i]);
            System.out.println("sistema na posicao"+i);
        }

    }
}
