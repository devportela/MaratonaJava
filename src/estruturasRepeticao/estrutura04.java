package estruturasRepeticao;

public class estrutura04 {
    public static void main(String[] args) {
        //dado o valor de um carro,descubra em quantas vezes ele pode ser parcelado
        //condicao valorParcela > 1000
        double valorTotal = 30000;
        for(int parcela = 1;parcela <= valorTotal;parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela" + parcela + "R$" +valorParcela);
            }else{
                break;
            }
        }
    }
}
