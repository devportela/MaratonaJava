package exceptions.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException illegal e arithmetic");
        } catch (RuntimeException e) {
            System.out.println("dentro do runtime Exception");


        }

        try {
            talvezLanceException();

        } catch (Exception e) {
            e.printStackTrace();
        }

    } //qualquer dessas referencias sao runtime Exception,por causa do polimorfismo
    //tomar cuidado com exceções mais genericas,sempre deixar elas por ultimo,exemplo:runtimeException ou IOexpecption


    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }


}
