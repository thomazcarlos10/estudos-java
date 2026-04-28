package aula;

public class Employee {
    public String name;
    public String position;
    public Double salary;

    public void displayInformation() {
        System.out.printf("Nome: %s - Cargo: %s - Salário: %.2f\n", name, position, salary);
    }

    public void adjustSalary(double percent) {
        salary += salary * (percent / 100);
        System.out.printf("Novo salário de %s é %.2f\n", name, salary);
    }
}
