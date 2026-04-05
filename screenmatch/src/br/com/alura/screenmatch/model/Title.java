package br.com.alura.screenmatch.model;

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
        return "Name: " + name
                + ", Year: " + releaseYear
                + ", Included in the plan: " + includedInThePlan
                + ", Evaluations sum: " + evaluationsSum
                + ", Total of reviews: " + totalOfReviews
                + ", Duration in minutes: " + durationInMinutes;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}