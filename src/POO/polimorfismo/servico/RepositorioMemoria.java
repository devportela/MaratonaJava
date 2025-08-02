package POO.polimorfismo.servico;

import POO.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em memoria");
    }
}
