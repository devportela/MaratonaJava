package POO.classesAbstratas.domain;

public class FiatUno extends Carro {
    @Override
    public void acelera() {
        System.out.println("acelerando o FIAT UNO ATÈ 500KM/H");
    }

    @Override
    public void freia() {
        System.out.println("freiando o FIAT UNO ATÈ 40KM/H");
    }
}
