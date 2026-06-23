package desafios.ex01;

public class Student {
    protected String name;
    protected String type;

    public Student(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void identify() {
        System.out.printf("Aluno: %s - Tipo: %s", name, type);
    }
}