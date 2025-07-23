package POO.classesAbstratas.domain;

public class Ferrari extends Carro {

    @Override
    public void acelera() {
        System.out.println("Acelerando a FERRARI ATÈ 350KM/H"); //sobrescrevendo o metodo abstrato freia da classe Carro
    }

    public void freia() {
        System.out.println("Freiando A FERRARI ATÈ 35KM/H"); //sobrescrevendo o metodo abstrato freia da classe Carro
    }


}