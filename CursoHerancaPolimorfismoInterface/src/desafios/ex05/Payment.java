package desafios.ex05;

public class Payment {
    protected Double value;

    public Payment(Double value) {
        this.value = value;
    }

    public double tax() {
        return value * 0.0;
    }

    public void confirmPayment() {
        System.out.printf("Pagamento de R$%.2f confirmado\n",
                value, tax());
    }
}
