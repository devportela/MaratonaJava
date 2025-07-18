package POO.heranca.test;

import POO.heranca.domain.Pessoa;

public class FuncionarioTest02 extends Pessoa {

    public FuncionarioTest02(String cpf, String nome) {
        super(cpf, nome);
    }

    public void imprime(){
        this.nome = "";
    }
}
