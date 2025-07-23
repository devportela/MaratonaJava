package POO.classesAbstratas.domain;

public class Gato extends Animal {
    protected String raca;
    protected String tipoPelo;

    public Gato(String especie, String nome, String raca, String tipoPelo) {
        super(especie, nome);
        this.raca = raca;
        this.tipoPelo = tipoPelo;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raca='" + raca + '\'' +
                ", tipoPelo='" + tipoPelo + '\'' +
                ", especie='" + especie + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void imprimeDadosAnimal() {
        System.out.println("CARACTERISTICAS GATO:");
        System.out.println(this.nome);
        System.out.println(this.especie);
        System.out.println(this.raca);
        System.out.println(this.tipoPelo);
    }
}
