package ex10;

public class ShoppingCart {
    public String name;
    public Double price;
    public Integer quantity;

    public double totalCalculation() {
        return price * quantity;
    }
}