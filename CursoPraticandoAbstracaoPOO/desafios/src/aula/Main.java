import aula.Employee;

void main() {
    Employee employee1 = new Employee();
    employee1.name = "Ana";
    employee1.position = "Gerente de Projetos";
    employee1.salary = 9000.00;

    Employee employee2 = new Employee();
    employee2.name = "João";
    employee2.position = "Desenvolvedor";
    employee2.salary = 8500.00;

    employee1.displayInformation();
    employee2.displayInformation();

    employee1.adjustSalary(8);
    employee2.adjustSalary(5);
}