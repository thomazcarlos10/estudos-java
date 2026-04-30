package ex09;

public class PointSystemStudents {
    private String name;
    private Integer points;
    private Integer level;

    public PointSystemStudents(String name) {
        this.name = name;
        this.points = 0;
        this.level = 1;
    }

    public void earnPoints(int points) {
        this.points += points;
        updateLevel();
    }

    public void updateLevel() {
        this.level = points / 100 + 1;
    }

    public void displayStats() {
        System.out.printf("Nome: %s\nPontos: %d\nNível: %d\n", name, points, level);
    }
}
