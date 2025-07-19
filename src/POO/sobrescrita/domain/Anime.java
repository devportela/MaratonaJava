package POO.sobrescrita.domain;

public class Anime {
    private String nome;
    private int idade;
    private String cpf;


    @Override
    public String toString() {
        return "Anime{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }  //metodo toString(),representa todo conteudo da classe ou objeto dentro de uma String literal.pode ser usada pra imprimir no sout.




    public Anime(String cpf, int idade, String nome) {
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
