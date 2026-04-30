package ex06;

public class BankBalanceControl {
    private String holder;
    private Double initialBalance;

    public BankBalanceControl(String holder) {
        this.holder = holder;
        initialBalance = 0.0;
    }

    public void toDeposit(double value) {
        if (value > 0) {
            initialBalance += value;
        } else {
            System.out.println("Valor de depisito inválido!!!");
        }
    }

    public void toWithdraw(double value) {
        if (value <= initialBalance) {
            initialBalance -= value;
        } else {
            System.out.println("Saldo insuficiente para saque!!!");
        }
    }

    public void displayBalance() {
        System.out.printf("Saldo atual de %s: R$ %.2f\n", holder, initialBalance);
    }
}