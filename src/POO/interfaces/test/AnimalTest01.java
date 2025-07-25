package POO.interfaces.test;

import POO.interfaces.domain.Cachorro;
import POO.interfaces.domain.Gato;

public class AnimalTest01 {
    public static void main(String[] args) {
        Gato g = new Gato();
        Cachorro c = new Cachorro();
        g.mover();
        g.falar();
        g.pular();
        System.out.println("------------");
        c.mover();
        c.falar();
        c.pular();




    }
}
