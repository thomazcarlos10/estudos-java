package ex08;

public class InventoryControl {
    public String name;
    public Integer quantity;

    public void toSell(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.printf("Venda realizada. Estoque restante de %s: %d\n", name, this.quantity);
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}
