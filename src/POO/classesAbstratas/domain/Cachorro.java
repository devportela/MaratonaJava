package POO.classesAbstratas.domain;

public class Cachorro extends Animal {
    protected String raca;
    protected String racaoEspecifica;

    public Cachorro(String especie, String nome, String raca, String racaoEspecifica) {
        super(especie, nome);
        this.raca = raca;
        this.racaoEspecifica = racaoEspecifica;
    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                ", racaoEspecifica='" + racaoEspecifica + '\'' +
                ", especie='" + especie + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void imprimeDadosAnimal() {
        System.out.println("CARACTERISTICAS CACHORRO:");
        System.out.println(this.nome);
        System.out.println(this.especie);
        System.out.println(this.raca);
        System.out.println(this.racaoEspecifica);
    }
}
