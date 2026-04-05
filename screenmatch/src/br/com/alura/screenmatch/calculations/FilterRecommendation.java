package br.com.alura.screenmatch.calculations;

public class FilterRecommendation {

    public void filter(Classification c) {
        if (c.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento.");
        } else if (c.getClassification() >= 2) {
            System.out.println("Muito bem avaliado no momento.");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}