package desafios.ex02;

public class Teacher extends Person {

    private String discipline;

    public Teacher(String personName, Integer age, String discipline) {
        super(personName, age);
        this.discipline = discipline;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\nNome: %s - Idade: %d - Disciplina: %s",
                personName, age, discipline);
    }
}