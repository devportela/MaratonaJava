package estruturasRepeticao;

public class estruturas02 {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 ate 100000
        for (int i = 0; i <= 100000; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
