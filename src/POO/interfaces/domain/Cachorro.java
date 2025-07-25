package POO.interfaces.domain;

public class Cachorro implements Animal {


    @Override
    public void mover() {
        System.out.println("cachorro ");
    }

    @Override
    public void pular() {
        System.out.println("cachorro");
    }

    @Override
    public void falar() {
        System.out.println("cachorro");
    }
}
