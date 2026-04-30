package ex10;

import java.util.ArrayList;
import java.util.List;

public class GradeRecord {
    private String subjectName;
    private List<Double> grade = new ArrayList<>();
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public GradeRecord(String subjectName) {
        this.subjectName = subjectName;
        count = 0;
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 10) {
            this.grade.add(grade);
            count++;
        } else {
            System.out.println("Nota inválida ignorada: " + grade);
        }
    }

    public void averageGrades() {
        double average = 0.0;
        for (Double g : grade) {
            average += g;
        }

        System.out.printf("Média em %s: %.2f", subjectName, average / grade.size());
    }
}