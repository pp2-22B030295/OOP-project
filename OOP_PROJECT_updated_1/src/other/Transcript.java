package other;

import java.util.HashMap;
import java.util.Map;

import Enums.Semester;

public class Transcript {
    Map<Semester, Grade> courseGrades = new HashMap<>();

    public Transcript() {
    }

    public void addGrade(Semester semester, Grade grade) {
        courseGrades.put(semester, grade);
    }

    public void viewTranscript() {
        System.out.println("Transcript");
        System.out.println("Semester\tAttestation 1\tAttestation 2\tFinal Exam\tGrade\tGPA");

        for (Map.Entry<Semester, Grade> entry : courseGrades.entrySet()) {
            Semester semester = entry.getKey();
            Grade grade = entry.getValue();

            System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    semester,
                    grade.getAttestation1(),
                    grade.getAttestation2(),
                    grade.getFinalExam(),
                    grade.getGrade(),
                    grade.getGradeChar(),
                    grade.getGpa());
        }
    }
}

       


