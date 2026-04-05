package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculations.Classification;

public class Episode implements Classification {

    private Integer number;
    private String name;
    private Series series;
    private Integer totalViewers;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Integer getTotalViewers() {
        return totalViewers;
    }

    public void setTotalViewers(Integer totalViewers) {
        this.totalViewers = totalViewers;
    }

    @Override
    public int getClassification() {
        if (totalViewers > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}