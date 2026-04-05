public class CreditCard {
    private Double limit;
    private Double balance;
    private Product product;

    public CreditCard(Double limit) {
        this.limit = limit;
        balance = limit;
    }

    public Double getLimit() {
        return limit;
    }

    public Double getBalance() {
        return balance;
    }

    public void purchase(Product product) {
        if (product.getValue() < balance) {
            balance -= product.getValue();
            System.out.println("Compra realizada!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}