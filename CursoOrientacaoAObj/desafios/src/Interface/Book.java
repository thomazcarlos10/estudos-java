package Interface;

public class Book implements Calculavel {

    private Double price;

    public Book(Double price) {
        this.price = price;
    }

    @Override
    public double calcularPrecoFinal() {
        return price + price * 0.1;
    }
}