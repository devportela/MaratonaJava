package POO.heranca.domain;

public class Animal   {
    protected String nome;
    protected String cor;


    public Animal(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
    }

    public void imprimeDadosAnimal() {
        System.out.println("INICIO SUPERCLASSE ANIMAL");
        System.out.println(this.nome);
        System.out.println(this.cor);
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
