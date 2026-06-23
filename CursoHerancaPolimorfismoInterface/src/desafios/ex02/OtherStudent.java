package desafios.ex02;

public class OtherStudent extends Person {

    private Double note;

    public OtherStudent(String personName, Integer age, Double note) {
        super(personName, age);
        this.note = note;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\nNome: %s - Idade: %d - Nota: %.2f",
                personName, age, note);
    }
}
