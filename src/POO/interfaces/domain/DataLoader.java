package POO.interfaces.domain;

public interface DataLoader {

    void load(); //todos os metodos por padrao em uma interface são publicos

    default void checkPermission() {
        System.out.println("fazendo checagem de permissoes");
    }

    static void retriveMaxDataSize() {
        System.out.println("Dentro do retrive na interface");
    }


}
