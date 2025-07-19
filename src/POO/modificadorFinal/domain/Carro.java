package POO.modificadorFinal.domain;

public class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public static final Comprador COMPRADOR = new Comprador(); //criacao da variavel de referencia que nao vai poder ser alterada


    public final void imprime() {

        System.out.println(this.nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
