package ex05;

public class CalculatingGrades {
    public String name;
    public Double g1;
    public Double g2;

    public void calculateAverage() {
        double average = (g1 + g2) / 2.0;

        if (average >= 7) {
            System.out.printf("Aluno: %s\nNota 1: %.1f\nNota 2: %.1f\nMédia: %.1f\nSituação: Aprovado!\n", name, g1, g2, average);
        } else {
            System.out.printf("Aluno: %s\nNota 1: %.1f\nNota 2: %.1f\nMédia: %.1f\nSituação: Reprovado!\n", name, g1, g2, average);
        }
    }
}
