package POO.heranca.domain;

public class CachorroPitbull extends Cachorro {


    protected String coleira;
    protected String racao;


    public CachorroPitbull(String cor, String nome, String raca, String tipoPelo, String coleira, String racao) {
        super(cor, nome, raca, tipoPelo);
        this.coleira = coleira;
        this.racao = racao;
    }

    public void imprimeDadosAnimal(){
        super.imprimeDadosAnimal();
        System.out.println("SUBCLASSE PITBULL");
        System.out.println(this.coleira);
        System.out.println(this.racao);

    }


    public String getColeira() {
        return coleira;
    }

    public void setColeira(String coleira) {
        this.coleira = coleira;
    }

    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }
}
