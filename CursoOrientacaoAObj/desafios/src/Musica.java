public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void avaliarMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }

    void fichaTecnica() {
        System.out.println("Titulo: " + titulo
                + "\nArtista: " + artista
                + "\nAno de lançamento: " + anoLancamento);
    }
}
