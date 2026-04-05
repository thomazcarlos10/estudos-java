package Interface;

public class ProdutoFisico implements Calculavel {

    private Double price;

    public ProdutoFisico(Double price) {
        this.price = price;
    }

    @Override
    public double calcularPrecoFinal() {
        return price - price * 0.1;
    }
}