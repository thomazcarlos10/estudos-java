package ex01;

public class Product {
    public String name;
    public Double price;
    public Integer quantity;

    public void displayInformation() {
        System.out.printf("Produto: %s\nPreço: R$ %.2f\nQuantidade em estoque: %d\n", name, price, quantity);

    }
}
