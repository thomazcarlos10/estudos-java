package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.exceptions.ConversionErrorException;

public class Title implements Comparable<Title> {
    private String name;
    private Integer releaseYear;
    private Boolean includedInThePlan;
    private Double evaluationsSum = 0.0;
    private Integer totalOfReviews = 0;
    private Integer durationInMinutes = 0;

    public Title() {
    }

    public Title(String name, Integer releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();

        if (myTitleOmdb.year().length() > 4) {
            throw new ConversionErrorException("Não consegui converter o ano," +
                    " porque tem mais de 04 caracteres.");
        } else {
            this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        }
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0, 3));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Boolean getIncludedInThePlan() {
        return includedInThePlan;
    }

    public Double getEvaluationsSum() {
        return evaluationsSum;
    }

    public Integer getTotalOfReviews() {
        return totalOfReviews;
    }

    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void displayTechnicalDataSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void evaluates(double note) {
        evaluationsSum += note;
        totalOfReviews++;
    }

    public double average() {
        return evaluationsSum / totalOfReviews;
    }

    @Override
    public String toString() {
        return "{Name: " + name
                + ", Year: " + releaseYear
                + ", Duration in minutes: " + durationInMinutes + "}";
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}