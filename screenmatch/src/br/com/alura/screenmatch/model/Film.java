package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculations.Classification;

public class Film extends Title implements Classification {

    private String Director;

    public Film(String name, Integer releaseYear, String director) {
        super(name, releaseYear);
        Director = director;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    @Override
    public int getClassification() {
        return (int) average() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + getName() + ", Ano de lançamento: " + getReleaseYear();
    }
}