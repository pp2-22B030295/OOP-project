package other;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

import Enums.Faculty;
import users.Student;
import users.Teacher;

public class Course implements Comparable<Course>{
	String courseCode;
    String courseName;
    Faculty faculty;
    HashSet<Lesson> lessons;
    HashSet<Student> enrolledStudents;
    HashSet<Teacher> instructors;
    int costInCredits;
    int duration;
    
    
	public Course(String courseCode, String courseName, Faculty faculty, 
			 	  int costInCredits, int duration) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.faculty = faculty;
		this.costInCredits = costInCredits;
		this.duration = duration;
	}
	
	
	public String getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Faculty getFaculty() {
		return faculty;
	}


	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}


	public HashSet<Lesson> getLessons() {
		return lessons;
	}


	public void setLessons(HashSet<Lesson> lessons) {
		this.lessons = lessons;
	}


	public HashSet<Student> getEnrolledStudents() {
		return enrolledStudents;
	}


	public void setEnrolledStudents(HashSet<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}


	public HashSet<Teacher> getInstructors() {
		return instructors;
	}


	public void setInstructors(HashSet<Teacher> instructors) {
		this.instructors = instructors;
	}


	public int getCostInCredits() {
		return costInCredits;
	}


	public void setCostInCredits(int costInCredits) {
		this.costInCredits = costInCredits;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public void addStudent(Student student) {
		enrolledStudents.add(student);
	}
	void addTeacher(Teacher teacher) {
		instructors.add(teacher);
	}
	void addLesson(Lesson lesson) {
		lessons.add(lesson);
	}


	public int hashCode() {
		return Objects.hash(costInCredits, courseCode, courseName, duration, enrolledStudents, faculty, instructors,
				lessons);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Course))
			return false;
		Course other = (Course) obj;
		return costInCredits == other.costInCredits && Objects.equals(courseCode, other.courseCode)
				&& Objects.equals(courseName, other.courseName) && duration == other.duration
				&& Objects.equals(enrolledStudents, other.enrolledStudents) && faculty == other.faculty
				&& Objects.equals(instructors, other.instructors) && Objects.equals(lessons, other.lessons);
	}
	
	// нужно добавить compareTo
	
	 public int compareTo(Course other) {
	     return this.courseCode.compareTo(other.courseCode);
		    
	 }

	
	
}
