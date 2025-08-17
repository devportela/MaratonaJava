package exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class exceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() throws IOException {


        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado com sucesso" + isCriado); // tente executar isso
        } catch (IOException e) {
            //NUNCA DEIXE ESSE BLOCO EM BRANCO
            //evitar por logica de negocio no catch
            e.printStackTrace(); // aprender a ler o stackTrace(), e as exceções
            throw e;
        }

    }

}
