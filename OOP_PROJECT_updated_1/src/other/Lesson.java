package other;

import java.util.HashSet;

import users.Data;
import Enums.Language;
import Enums.LessonType;
import Enums.Time;
import Enums.WeekDays;
import users.Student;
import users.Teacher;



public class Lesson {
    public String lessonName;
    LessonType lessonType;
    Language language;
    public Teacher teacher;
    HashSet<Student> students;
    Time startTime;
    Time endTime;
    WeekDays weekDay;
	public Lesson(String lessonName, LessonType lessonType, Language language, Time startTime, Time endTime,
			WeekDays weekDay) {
		this.lessonName = lessonName;
		this.lessonType = lessonType;
		this.language = language;
		this.startTime = startTime;
		this.endTime = endTime;
		this.weekDay = weekDay;
	}
	
	
	public void addStudent(String studentId) {
	    Student student = Data.getInstance().getStudentInfo(studentId);

	    if (student != null) {
	        if (students == null) {
	            students = new HashSet<>();
	        }

	        students.add(student);
	        System.out.println("Студент " + student.getFullName() + " добавлен в урок" + lessonName);
	    } else {
	        System.out.println("Студент с ID " + studentId + " не найден.");
	    }
	}
	

}
