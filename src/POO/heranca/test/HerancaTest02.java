package POO.heranca.test;

import POO.heranca.domain.Funcionario;

public class HerancaTest02 {
    // 0 - bloco de inicializacao estatico da superclasse é executado quando a jvm carregar a classe pai
    // 1 - bloco de inicializacao estatica da subclasse é executado quando a jvm carregar a classe filha
    // 2 -alocada espaço em memoria pro objeto da classe pai
    // 3-cada atributo da classe é criado e inicializado com valores default ou o quer for passado da classe pai
    // 4 - bloco de inicializaçao da superclasse é executado na ordem em que aparece
    // 5 - construtor da superclasse é executado
    // 6 - alocado espaço em memoria pro objeto da subclasse
    // 7 - cada atributo de subclasse é criado e inicializado com valores default ou o quer for passado
    // 7 - blocos de inicializaçao da subclasse é executado  na ordem em que aparece no codigo;
    // 8 - construtor é executado da subclasse


    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("00000000", "gustavo");
    }

}
