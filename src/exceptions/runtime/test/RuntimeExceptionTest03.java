package exceptions.runtime.test;

import javax.swing.plaf.RootPaneUI;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao2();

    }

    private static String abreConexao2() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
            throw new RuntimeException();

        } finally {
            System.out.println("fechando recurso liberado pelo SO");
        }
    }
}