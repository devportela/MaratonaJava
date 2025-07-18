package POO.heranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;


    static {
        System.out.println("dentro do bloco estatico pessoa");
    }
    {
        System.out.println("dentro do bloco de inicilizacao pessoa1'");
    }
    {
        System.out.println("dentro do bloco de inicilizacao pessoa2");
    }



    public Pessoa(String cpf, String nome) {
        System.out.println("dentro do construtor pessoa");
        this.cpf = cpf;
        this.nome = nome;
    }

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + "---" + this.endereco.getCep());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
