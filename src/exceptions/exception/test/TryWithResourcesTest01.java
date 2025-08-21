package exceptions.exception.test;

import exceptions.exception.domain.Leitor1;
import exceptions.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
lerArquivo();
lerArquivo2();


    }



    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
        Leitor2 leitor2 = new Leitor2();
        ){

        }catch (IOException e){

        } // try with resources nao precisa do catch,mas tem que usar o "throws" da exceção que esta sendo lançada
    }



    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
