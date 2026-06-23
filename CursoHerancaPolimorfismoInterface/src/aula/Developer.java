package aula;

public class Developer extends Employee {
    private String stack;

    public Developer(String name, Double salary, String stack) {
        super(name, salary);
        this.stack = stack;
    }

    // Polimorfismo por sobrescrita
    @Override
    public void displayInfo() {
        System.out.printf("\nDesenvolvedor: %s - salário: %.2f - stack: %s",
                name, salary, stack);
    }

    @Override
    public void calculationPLR() {
        System.out.println("PLR do developer");
    }
}