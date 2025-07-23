package POO.classesAbstratas.test;

import POO.classesAbstratas.domain.Ferrari;
import POO.classesAbstratas.domain.FiatUno;

public class CarroTest01 {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        Ferrari ferrari = new Ferrari();
        ferrari.acelera();
        ferrari.freia();
        System.out.println("-------------------------------");
        FiatUno fiatUno = new FiatUno();
        fiatUno.acelera();
        fiatUno.freia();
    }
}
