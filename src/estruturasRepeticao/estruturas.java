package estruturasRepeticao;

public class estruturas {
    public static void main(String[] args) {
        //while,do while,for
        //estruturas basica de repeticao

        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        do {
            System.out.println("dentro do do while");
        }while (count < 10);



        count = 0;

        for(int i=0;i < 10;i++){
            System.out.println("For"+i);
        }


    }
}
