package exceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        System.out.println(divisao(1, 3));
    }

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("argumento ilegal,nao pode ser zero"); // quando quiser lançar uma exceção,normalmente do tipo Runtime
        }
        return a / b;

    }
}
