package POO.heranca.domain;

public class Funcionario extends Pessoa {
    double salario;


    static {
        System.out.println("dentro do bloco estatico pessoa");
    }
    {
        System.out.println("dentro do bloco de inicilizacao f'");
    }
    {
        System.out.println("dentro do bloco de inicilizacao f");
    }


    public Funcionario(String cpf, String nome) {
        super(cpf,nome);
        this.salario = salario;
        System.out.println("bloco construtor funcionario");
    }

    public void imprimeDados() {
        super.imprimeDados();
        System.out.println(this.getSalario());
    }


    public void relatorioPagamento() {
        System.out.println("EU" + this.nome + "recebi o salario de :" + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
