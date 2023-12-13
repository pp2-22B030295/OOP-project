package users;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Enums.Faculty;
import Enums.ResearchActionType;
import Enums.Semester;
import Research.CanDoResearch;
import Research.ResearchPaper;
import Research.ResearcherType;
import other.Complaint;
import other.Course;
import other.Grade;
import other.Lesson;
import other.Mark;
import other.UrgencyLevel;

public class Teacher extends Employee{
	HashSet<Course> courses;
    
    
    public Teacher() {}
    public Teacher(String id, String fullName, double salary, String password) {
		super(id, fullName, salary, password);
	}
    
    void addMarkAttestation1(String studentId, String courseCode, double score, Semester semester) {
        Course course = Data.getInstance().getCourseInfo(courseCode);
        Set<Student> students = course.getEnrolledStudents();
        
        for (Student student : students) {
            if (studentId.equals(student.getId())) {
                Grade grade = student.getCourseGrades().get(semester);
                if (grade != null) {
                    grade.addAttestation1Mark(score);
                    Mark mark = new Mark(student , this , course , score);
                    Data.getInstance().getStudentInfo(studentId).addMark(mark);
                    System.out.println("Mark added to Attestation 1 for student " + student.getFullName());
                } else {
                    System.out.println("Student is not enrolled in the specified course or semester.");
                }
                break;
            }
        }
    }

    void addMarkAttestation2(String studentId, String courseCode, double score, Semester semester) {
        Course course = Data.getInstance().getCourseInfo(courseCode);
        if (course != null) {
            Set<Student> students = course.getEnrolledStudents();

            for (Student student : students) {
                if (studentId.equals(student.getId())) {
                    Grade grade = student.getCourseGrades().get(semester);
                    if (grade != null) {
                        grade.addAttestation2Mark(score);
                        Mark mark = new Mark(student, this, course, score);
                        Data.getInstance().getStudentInfo(studentId).addMark(mark);
                        System.out.println("Mark added to Attestation 2 for student " + student.getFullName());
                    } else {
                        System.out.println("Student is not enrolled in the specified course or semester.");
                    }
                    break;
                }
            }
        } else {
            System.out.println("Course not found.");
        }
    }

    
    void seeStudentInCourse(String studentId) {
    	Set<Lesson> lessons = Data.getInstance().getStudentInfo(studentId).schedule.lessons;
    	for(Lesson l : lessons) {
    		Course c = l.getCourse();
    		for(Teacher t : c.getInstructors()) {
    			if(this.equals(t)) {
    				System.out.println(Data.getInstance().getStudentInfo(studentId));
    			}
    		}
    	}	
    }
    
    void submitComplaint(String studentId, UrgencyLevel urgency, String text) {
        Complaint complaint = new Complaint(studentId, urgency, text);
        Data.getInstance().getComplaints().add(complaint);
        System.out.println("Complaint submitted successfully.");
    }
    
    void workWithCourse(String courseCode) {
    	
    };
    
    
}
