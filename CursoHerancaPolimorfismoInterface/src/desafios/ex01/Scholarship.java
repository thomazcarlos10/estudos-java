package desafios.ex01;

public class Scholarship extends Student {

    public Scholarship(String name) {
        super(name, "bolsista");
    }

    @Override
    public void identify() {
        System.out.printf("\nAluno: %s - Tipo: %s\n", name, type);
    }
}