package exceptions.exception.domain;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException{
        System.out.println("salvando funcionario");
    } //quando voce esta sobrecrevendo um metodo,voce nao é obrigado a escrever as exceções novamente
    //voce nao pode declarar uma nova exceção checked nessa classse,tem que declarar no metodo que está sendo herdaddo
}
