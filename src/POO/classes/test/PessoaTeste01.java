package POO.classes.test;

import POO.classes.domain.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(50);
        pessoa.imprime();
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());

    }
}
