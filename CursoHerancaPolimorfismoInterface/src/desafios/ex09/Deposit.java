package desafios.ex09;

public class Deposit extends BankOperation {
    public Deposit(Double value) {
        super(value);
    }

    @Override
    public void execute() {
        System.out.printf("\nDepósito de R$%.2f realizado\n", value);
    }
}
