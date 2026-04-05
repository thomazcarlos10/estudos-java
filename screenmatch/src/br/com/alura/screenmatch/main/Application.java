import br.com.alura.screenmatch.calculations.FilterRecommendation;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Film;
import br.com.alura.screenmatch.model.Series;

void main() {
    Film myFilm = new Film("O Poderoso Chefão", 1970, "Eichiro Oda");
    myFilm.setDurationInMinutes(180);
    myFilm.displayTechnicalDataSheet();
    myFilm.evaluates(8);
    myFilm.evaluates(5);
    myFilm.evaluates(10);
    System.out.println("Total de avaliações: " + myFilm.getTotalOfReviews());
    System.out.println("Soma das avaliações: " + myFilm.getEvaluationsSum());
    System.out.println("Média de avaliações: " + myFilm.average());

    System.out.println();
    Series series = new Series("One Piece", 1997, 20, 50, true, 22);
    series.displayTechnicalDataSheet();
    System.out.println("Duração para maratonar One Piece: " + series.getDurationInMinutes());

    Film otherFilm = new Film("Avatar", 2023, "Eichiro Oda");
    otherFilm.setDurationInMinutes(200);

    System.out.println();
    TimeCalculator calc = new TimeCalculator();
    calc.includes(myFilm);
    calc.includes(otherFilm);
    calc.includes(series);
    System.out.println(calc.getTotalTime());

    FilterRecommendation filterRecommendation = new FilterRecommendation();
    filterRecommendation.filter(myFilm);

    Episode episode = new Episode();
    episode.setNumber(1);
    episode.setSeries(series);
    episode.setTotalViewers(300);
    filterRecommendation.filter(episode);

    System.out.println();
    Film filmPaulo = new Film("Dogville", 2003, "Eichiro Oda");
    filmPaulo.setDurationInMinutes(200);
    filmPaulo.evaluates(10);

    ArrayList<Film> filmList = new ArrayList<>();
    filmList.add(filmPaulo);
    filmList.add(myFilm);
    filmList.add(otherFilm);
    System.out.println("Tamanho da lista: " + filmList.size());
    System.out.println("Primeiro filme: " + filmList.getFirst().getName());
    System.out.println(filmList);
}