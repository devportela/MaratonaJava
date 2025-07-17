package POO.associacao.domain;

public class Time {

    private String nome;
    private Jogador[] jogadores;


    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (jogadores == null) {
            return;
        }
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }


    public Time(Jogador[] jogadores, String nome) {
        this.jogadores = jogadores;
        this.nome = nome;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
