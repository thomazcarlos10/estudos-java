import aula.Developer;
import aula.Employee;
import aula.Manager;

void main() {
    Employee manager = new Manager("Kyoshi", 20000.00);
    ((Manager) manager).setBonus(1000.00);
    manager.displayInfo();
    manager.readjustSalary(2);
    ((Manager) manager).approverProject("Teste Robótica");

    Employee dev = new Developer("Carlos", 12000.00, "Backend Java");
    dev.readjustSalary();
    dev.displayInfo();
}