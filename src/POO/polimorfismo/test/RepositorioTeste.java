package POO.polimorfismo.test;

import POO.polimorfismo.repositorio.Repositorio;
import POO.polimorfismo.servico.RepositorioArquivo;
import POO.polimorfismo.servico.RepositorioBancoDeDados;
import POO.polimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("vegeta");
        list.add("kuririn");

    }
}
