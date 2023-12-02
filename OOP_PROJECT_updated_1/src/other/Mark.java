package other;

import users.Student;
import users.Teacher;

public class Mark {
    double score;
    Student student;
    Teacher teacher;
    Course course;
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Course: " + course.courseName + "\nTeacher: " + 
				teacher.getFullName() + "\nMark: " + score;
	}
    
}
