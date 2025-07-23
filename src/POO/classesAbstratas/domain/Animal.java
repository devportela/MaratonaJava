package POO.classesAbstratas.domain;

public abstract class Animal {

    protected String nome;
    protected String especie;

    public Animal(String especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public abstract void imprimeDadosAnimal();

}
