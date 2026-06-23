package desafios.ex05;

public class Pix extends Payment {

    public Pix(Double value) {
        super(value);
    }

    @Override
    public void confirmPayment() {
        System.out.printf("Pagamento via Pix de R$%.2f confirmado.\n",
                value);
    }
}