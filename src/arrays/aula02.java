package arrays;

import javax.management.monitor.StringMonitor;

public class aula02 {
    public static void main(String[] args) {
        /*
        int idade01 = 15;
        int idade02 = 14;
        int idade03 = 17;
        System.out.println(idade01);
        System.out.println(idade02);
        System.out.println(idade03);
        ARMAZENANDO 3 IDADES SEM O USO DE ARRAYS
         */


        //byte,short,int,long,float e double 0
        //char 'u/000' ''
        //boolean false
        //String null

        String[] nomes = new String[3];
        nomes[0] = "goku";
        nomes[1] = "kurosaki";
        nomes[2] = "luffy";
        nomes[3] = "nagato";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
