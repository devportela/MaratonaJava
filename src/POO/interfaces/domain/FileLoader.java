package POO.interfaces.domain;

public class FileLoader implements DataLoader,DataRemover {

    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");

    }

    @Override
    public void remove() {
        System.out.println("removendo dados de um arquivoa");
    }


    @Override
    public void checkPermission() {
        System.out.println("checando permissoes no arquivo");
    }



}
