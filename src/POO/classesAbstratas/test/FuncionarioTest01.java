package POO.classesAbstratas.test;

import POO.classesAbstratas.domain.Desenvolvedor;
import POO.classesAbstratas.domain.Funcionario;
import POO.classesAbstratas.domain.Gerente;

public class  FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nani",5000);
        Desenvolvedor dev = new Desenvolvedor("gustavo",12000);
        System.out.println(gerente);
        System.out.println(dev);
        gerente.imprime();
        dev.imprime();


    }
}
