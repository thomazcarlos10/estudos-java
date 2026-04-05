package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.model.Film;
import br.com.alura.screenmatch.model.Series;
import br.com.alura.screenmatch.model.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainWithLists {
    static void main() {
        Film myFilm = new Film("O Poderoso Chefão", 1970, "Eichiro Oda");
        myFilm.evaluates(9);
        Film otherFilm = new Film("Avatar", 2023, "Eichiro Oda");
        otherFilm.evaluates(6);
        Film filmPaulo = new Film("Dogville", 2003, "Eichiro Oda");
        filmPaulo.evaluates(10);
        Series series = new Series("One Piece", 1997, 20, 50, true, 22);

        List<Title> list = new ArrayList<>();
        list.add(filmPaulo);
        list.add(myFilm);
        list.add(otherFilm);
        list.add(series);
        for (Title t : list) {
            System.out.println(t.toString());
            if (t instanceof Film) { // Confere se t é uma instância de Filme
                System.out.println("Classificação: " + ((Film) t).getClassification());
            }
        }
        System.out.println("Ordenando em ordem alfabetica:");
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Ordenando por ano:");
        System.out.println(list);

        System.out.println();
        ArrayList<String> searchForArtist = new ArrayList<>();
        searchForArtist.add("Adam Sandler");
        searchForArtist.add("Paulo");
        searchForArtist.add("Jacqueline");
        System.out.println(searchForArtist);

        Collections.sort(searchForArtist); // Ordena por ordem alfabetica
        System.out.println("Depois da ordenação:");
        System.out.println(searchForArtist);
    }
}