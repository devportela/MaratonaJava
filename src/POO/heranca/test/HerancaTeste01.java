package POO.heranca.test;

import POO.heranca.domain.Endereco;
import POO.heranca.domain.Funcionario;
import POO.heranca.domain.Pessoa;

public class HerancaTeste01 extends Pessoa {

    public HerancaTeste01(String cpf, String nome) {
        super(cpf, nome);
    }

    public static void main(String[] args) {


        Endereco endereco = new Endereco();

        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("324324324","gustavo");
        pessoa.setNome("gustavo");
        pessoa.setCpf("11111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprimeDados();



        Funcionario funcionario = new Funcionario("11111111","gustavo");
        funcionario.setNome("sei la");
        funcionario.setCpf("1111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000.00);
        funcionario.imprimeDados();


    }
}
