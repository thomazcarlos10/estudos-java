package desafios.ex05;

public class CreditCard extends Payment {

    public CreditCard(Double value) {
        super(value);
    }

    @Override
    public double tax() {
        return value * 0.03;
    }

    @Override
    public void confirmPayment() {
        System.out.printf("\nPagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)\n",
                value, tax());
    }
}
