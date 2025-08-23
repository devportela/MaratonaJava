package exceptions.exception.test;

import exceptions.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
logar();

        }catch (LoginInvalidoException e ){
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDb = "Goku";
        String senhaDb = "ssj";
        System.out.println("usuario:");
        String usernameDigitado = teclado.nextLine();
        System.out.println("senha:");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDb.equals(usernameDigitado) || !senhaDb.equals(senhaDigitada)){
            throw new LoginInvalidoException("usuario ou senha invalidos!");

        }
        System.out.println("usuario logado com sucesso!");
    }
}
