package ex09;

public class LateFee {
    public String title;
    public Integer daysOfDelay;

    public double calculateFine() {
        return daysOfDelay * 2.50;
    }

    public void displayInfo() {
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f\n", title, daysOfDelay, calculateFine());
    }
}
