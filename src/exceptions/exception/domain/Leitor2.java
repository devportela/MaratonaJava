package exceptions.exception.domain;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("fechando leitor 2");
    }
}
