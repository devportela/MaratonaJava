package POO.blocosdeInicialização.domain;

public class Anime {

    private String nome;
    private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    {
        System.out.println("Dentro do bloco de inicializacao");
    }




    public Anime(String nome) {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodios : this.episodios) {
            System.out.println(episodios + "");
        }
    }


    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

}



