package aula;

public class Employee {
    private String name;
    private String position;
    private Double salary;
    private Integer adjustmentControl = 0;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void displayInformation() {
        System.out.printf("Nome: %s - Cargo: %s - Salário: %.2f\n", name, position, salary);
    }

    public void adjustSalary(double percent) {
        if (adjustmentControl >= 1) {
            System.out.println("Não pode fazer reajustes.");
        } else {
            adjustmentControl++;
            salary += salary * (percent / 100);
            System.out.printf("Novo salário de %s é %.2f\n", name, salary);
        }
    }
}
