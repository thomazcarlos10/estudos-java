package desafios.ex09;

public class BankOperation implements BankingAction {
    protected Double value;

    public BankOperation(Double value) {
        this.value = value;
    }

    @Override
    public void execute() {}
}