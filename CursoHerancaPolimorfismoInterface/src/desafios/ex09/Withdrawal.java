package desafios.ex09;

public class Withdrawal extends BankOperation {
    public Withdrawal(Double value) {
        super(value);
    }

    @Override
    public void execute() {
        System.out.printf("Saque de R$%.2f realizado\n\n", value);
    }
}