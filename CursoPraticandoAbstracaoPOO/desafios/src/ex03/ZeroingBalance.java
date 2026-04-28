package ex03;

public class ZeroingBalance {
    public Double balance;

    public void resetBalance() {
        balance = 0.0;
    }

    public void displayBalance() {
        System.out.printf("Saldo atual: R$ %.2f\n", balance);
    }
}