package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.model.Title;

public class TimeCalculator {

    private Integer totalTime = 0;

    public Integer getTotalTime() {
        return totalTime;
    }

    /* public void includes(Film f) {
        totalTime += f.getDurationInMinutes();
    }

    public void includes(Series s) {
        totalTime += s.getDurationInMinutes();
    } */

    public void includes(Title t) {
        System.out.println("Adicionando duração em minutos de " + t);
        totalTime += t.getDurationInMinutes();
    }
}