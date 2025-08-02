package POO.polimorfismo.servico;

import POO.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em um banco de dados");
    }
}
