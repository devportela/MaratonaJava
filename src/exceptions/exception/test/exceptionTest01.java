package exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class exceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() {


        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado com sucesso" + isCriado);
        } catch (IOException e) {
            //NUNCA DEIXE ESSE BLOCO EM BRANCO
            //evitar por logica de negocio no catch
            e.printStackTrace();
        }

    }

}
