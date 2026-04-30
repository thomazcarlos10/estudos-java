package ex07;

import java.util.ArrayList;
import java.util.List;

public class MovieReview {
    private String title;
    private List<Integer> reviewList = new ArrayList<>();

    public MovieReview(String title) {
        this.title = title;
    }

    public void evaluateMovie(int review) {
        if (review >= 1 && review <= 5) {
            reviewList.add(review);
        } else {
            System.out.println("Nota inválida. Por favor, insira um valor entre 1 e 5.");
        }
    }

    public void calculationAverage() {
        double average = 0.0;
        for (Integer r : reviewList) {
            average += r;
        }

        System.out.printf("Média de avaliações para %s: %.2f\n", title, average / reviewList.size());
    }
}