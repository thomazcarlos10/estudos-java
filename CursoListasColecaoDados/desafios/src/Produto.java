public class Produto {

    private String name;
    private Double price;
    private Integer quantity;

    public Produto(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Nome do produto: " + name + ", Preço: " + price + ", Quantidade: " + quantity;
    }
}