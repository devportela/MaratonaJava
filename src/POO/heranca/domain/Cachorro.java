package POO.heranca.domain;

public class Cachorro extends Animal {
    protected String raca;
    protected String tipoPelo;


    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                ", tipoPelo='" + tipoPelo + '\'' +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Cachorro(String cor, String nome, String raca, String tipoPelo) {
        super(cor, nome);
        this.raca = raca;
        this.tipoPelo = tipoPelo;
    }

    public void imprimeDadosAnimal() {
        super.imprimeDadosAnimal();
        System.out.println("INICIO SUBCLASSE CACHORRO ");
        System.out.println(this.raca);
        System.out.println(this.tipoPelo);
        System.out.println("PROGRAMA FINALIZADO NA SUBCLASSE CACHORRO");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
}
