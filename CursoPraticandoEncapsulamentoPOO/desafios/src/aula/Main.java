import aula.Employee;

void main() {
    Employee employee = new Employee("João",8500.00);
    employee.setPosition("Desenvolvedor Júnior");

    employee.displayInformation();
    employee.adjustSalary(5);
}