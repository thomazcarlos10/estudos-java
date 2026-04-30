package ex03;

public class ProductRegistration {
    private String name;
    private Double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Preço inválido.");
            this.price = 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}