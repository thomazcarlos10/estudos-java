package aula;

public abstract class Employee { // Classe abstrata serve como modelo para que as subclasses herdem seus comportamento e atributos.
     protected String name;
     protected Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.printf("\nFuncionario %s - Salário: %.2f ",
                name, salary);
    }

    public void readjustSalary(double percent) {
        salary += salary * (percent / 100);
        System.out.printf("\nNovo salario de %s é %.2f", name, salary);
    }

    // Polimorfismo por sobrecarga
    public void readjustSalary() {
        salary += 500.00;
        System.out.printf("\nSalário com dissídio de %s é %.2f", name, salary);
    }

    public abstract void calculationPLR(); // Os métodos abstratos servem como metodo, obrigando que todas as classes filhas façam sua implementação.
}