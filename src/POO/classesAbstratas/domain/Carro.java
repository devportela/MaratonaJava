package POO.classesAbstratas.domain;

public abstract class Carro {
    protected String marca;
    protected String cor;
    protected String modelo;
    protected double velocidadeMinima;
    protected double velocidadeMaxima;

    public abstract void acelera(); //metodo abstrato


    public abstract void freia();  //metodo abstrato

}
