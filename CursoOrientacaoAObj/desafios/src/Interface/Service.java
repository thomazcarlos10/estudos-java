package Interface;

public class Service implements Vendavel {

    private Double price;
    private Double tot;

    public Service(Double price) {
        this.price = price;
    }

    public Double getTot() {
        return tot;
    }

    @Override
    public double precoTotal(int quantidade) {
        tot = price * quantidade;
        return tot;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        double totalDesc = price * percentualDesconto;
        tot -= totalDesc;
    }
}