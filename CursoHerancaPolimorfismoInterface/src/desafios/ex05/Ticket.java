package desafios.ex05;

public class Ticket extends Payment {

    public Ticket(Double value) {
        super(value);
    }

    @Override
    public double tax() {
        return value * 0.01;
    }

    @Override
    public void confirmPayment() {
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n",
                value, tax());
    }
}