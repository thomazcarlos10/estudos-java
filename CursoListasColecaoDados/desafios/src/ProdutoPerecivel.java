public class ProdutoPerecivel extends Produto {

    private String dataDeValidade;

    public ProdutoPerecivel(String name, Double price, Integer quantity, String dataDeValidade) {
        super(name, price, quantity);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de validade: " + dataDeValidade;
    }
}