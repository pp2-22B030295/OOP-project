package other;

import Enums.Semester;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Transcript {

    public Set<CourseGrade> transcript = new TreeSet<>(); //private

    public Transcript() {
    }

    public void viewTranscript() {
        System.out.println("Transcript");

        for (CourseGrade courseGrade : transcript) {
            System.out.println("Course Code: " + courseGrade.courseCode);
            System.out.println("Semester\tAttestation 1\tAttestation 2\tFinal Exam\tGrade\tGPA");

            Map<Semester, Grade> courseGrades = courseGrade.getCourseGrades();

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
            System.out.println();
        }
    }
}
