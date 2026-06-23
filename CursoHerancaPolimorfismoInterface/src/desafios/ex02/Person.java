package desafios.ex02;

public class Person {
    protected String personName;
    protected Integer age;

    public Person(String personName, Integer age) {
        this.personName = personName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.printf("\nNome: %s - Idade: %d", personName, age);
    }
}
