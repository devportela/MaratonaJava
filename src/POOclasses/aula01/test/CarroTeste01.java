package POOclasses.aula01.test;

import POOclasses.aula01.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Civic";
        carro1.modelo = "Civic 2019";
        carro1.ano = 1980;

        carro2.modelo = "toyota 2025";
        carro2.nome = "Toyota";
        carro2.ano = 2025;


        carro1 = carro2; //carro1 recebe o mesmo espaço de memoria que o objeto carro2


        System.out.println("Carro 1:");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("Carro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
