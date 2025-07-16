package POO.modificadoresEstaticos.test;

import POO.modificadoresEstaticos.domain.Carro;

public  class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Bmw", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("audi", 290);
        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();




    }
}
