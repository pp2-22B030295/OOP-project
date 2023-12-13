package Testing;

import Enums.Faculty;
import Enums.LessonType;
import Enums.Semester;
import Enums.Time;
import Enums.WeekDays;
import other.Course;
import other.Grade;
import other.Lesson;
import other.Transcript;
import users.Student;

import java.util.Date;

public class TestTranscript {
    public static void main(String[] args) {

        Course mathCourse = new Course("MAT101", "Mathematics", Faculty.FIT, 3, 16);

        Student student = new Student("S123", "John Doe", Faculty.FIT, new Date(), 2, "password");

        mathCourse.addStudent(student);

        Lesson mathLesson = new Lesson("Algebra", LessonType.PRACTICE, null, Time.h10, Time.h12, WeekDays.Mon);
        mathLesson.course = mathCourse;

        student.addLessonToSchedule(mathLesson);

        Grade mathGrade = new Grade();
        mathGrade.setAttestation1(90);
        mathGrade.setAttestation2(85);
        mathGrade.setFinalExam(88);

        student.addCourseSemesterGrade(mathCourse.getCourseCode(), Semester.First, mathGrade);

        student.seeTranscript();
    }
}
