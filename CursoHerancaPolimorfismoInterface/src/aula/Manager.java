package aula;

public class Manager extends Employee implements Approver {
    private Double bonus;

    public Manager(String name, Double salary) {
        super(name, salary);
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    // Polimorfismo por sobrescrita
    @Override
    public void displayInfo() {
        System.out.printf("Gerente: %s - salário %.2f - bônus: %.2f",
                name, salary, bonus);
    }

    @Override
    public void calculationPLR() {
        System.out.println("PLR do manager");
    }

    @Override
    public void approverProject(String projectName) {
        System.out.printf("\nGerente: %s aprovou o projeto %s",
                name, projectName);
    }
}