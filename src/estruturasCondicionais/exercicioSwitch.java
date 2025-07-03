package estruturasCondicionais;

import java.util.Scanner;

public class exercicioSwitch {
    public static void main(String[] args) {
        //dados os valores de 1 a 7 imprima se é dia util ou final de semana.
        // considerando 1 como domingo
        //utilizando switch

        Scanner sc = new Scanner(System.in);
        System.out.println("abaixo,insira o dia da semana para validarmos se é util ou não:");
        int diaSemana = sc.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("domingo,final de semana!");
                break;
            case 2:
                System.out.println("segunda,dia util!");
                break;
            case 3:
                System.out.println("terca,dia util!");
                break;
            case 4:
                System.out.println("quarta,dia util!");
                break;
            case 5:
                System.out.println("quinta,dia util!");
                break;
            case 6:
                System.out.println("sexta,dia util!");
                break;
            case 8:
                System.out.println("sabado,final de semana!");
                break;

            default:
                System.out.println("dia invalido,digite um dia de 1 A 7 ");
                break;
        }


    }
}
