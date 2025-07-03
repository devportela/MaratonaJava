package estruturasCondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        //doar se o salario for > 5000
        double salario = 6000;
        String mensagemDoar = "eu vou doar 500 pro dev dojo kkkk";
        String mensagemNaoDoar = "ainda nao tenho condicoes,vou ter ";

        //(condicao)? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
