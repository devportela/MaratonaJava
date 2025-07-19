package POO.modificadorFinal.test;

import POO.modificadorFinal.domain.Carro;
import POO.modificadorFinal.domain.Ferrari;

public  class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(Carro.COMPRADOR);
        carro.COMPRADOR.setNome("KURIRIM");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();



    }
}
