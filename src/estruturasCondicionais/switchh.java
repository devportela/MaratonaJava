package estruturasCondicionais;

import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
        byte dia = 5;
        // char,int,byte,short,enum,String

        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;

            case 2:
                System.out.println("ter");
                break;

            case 4:
                System.out.println("quar");
                break;
            case 5:
                System.out.println("quin");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;

            default:
                System.out.println("opcao invalida");


        }

    }
}
