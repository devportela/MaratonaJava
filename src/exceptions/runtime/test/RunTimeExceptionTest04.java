package exceptions.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dentro do indexOutBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("dentro do illegal argumentException");
        } catch (ArithmeticException e) {
            System.out.println("dentro do arithmeticException");
        } catch (RuntimeException e) {
            System.out.println("dentro do runtime Exception");



        }

        try {
        talvezLanceException();

        }catch (IOException e ){

        } catch (SQLException e) {
            e.printStackTrace();
        }



    } //qualquer dessas referencias sao runtime Exception,por causa do polimorfismo
    //tomar cuidado com exceções mais genericas,sempre deixar elas por ultimo





    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }


}
