package POO.classesAbstratas.test;

import POO.classesAbstratas.domain.Animal;
import POO.classesAbstratas.domain.Cachorro;
import POO.classesAbstratas.domain.Gato;

public class AnimalTest01 {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Cachorro","Doguinho","Pastor Alemao","Golden Premium 1");
        Animal cat = new Gato("Gato","Jerry","Gato Belga","Pelo Pequeno");

        System.out.println(dog); //imprimindo o toString();
        System.out.println("------------------------");
        dog.imprimeDadosAnimal();
        System.out.println("-------------------------");
        System.out.println(cat); //imprimindo o toString();
        cat.imprimeDadosAnimal();
    }
}
