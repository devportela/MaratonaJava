package POO.interfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    //private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }


    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados ");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissoes no banco de dados");
    }


    public static void retriveMaxDataSize(){
        System.out.println("dentro do retrieve na classe database");
    }


}
