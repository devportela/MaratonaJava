package POO.classesAbstratas.domain;

public class FiatUno extends Carro {
    @Override
    public void acelera() { //override do metodo abstrato
        System.out.println("acelerando o FIAT UNO ATÈ 500KM/H");
    }

    @Override
    public void freia() { //override do metodo abstrato
        System.out.println("freiando o FIAT UNO ATÈ 40KM/H");
    }
}
