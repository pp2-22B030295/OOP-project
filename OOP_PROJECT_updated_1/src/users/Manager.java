package users;

import java.util.HashSet;
import java.util.Set;

import Enums.ActionType;
import other.Course;

public class Manager extends Employee {
	HashSet<Course> courses = new HashSet<Course>();
    
	public Manager() {}
    public Manager(String id, String name, double salary , String password) {
    	super(name, id , salary, password);
    }
    
    
	void giveAcsessForCourseRegistration(String acsess) {
		Data.getInstance().changeRegistrationAcsess(acsess);
	};
    
    
    void registerStudentToCourse(String studentId, String courseCode) {
        Student student = Data.getInstance().getStudentInfo(studentId);
        Course course = Data.getInstance().getCourseInfo(courseCode);

        if (student != null && course != null) {
            course.addStudent(student);
            System.out.println("Студент " + student.getFullName() + " зарегестрирован на курс " + course.getCourseName());
        } else {
            System.out.println("Студент или курс не был найден.");
        }
    }
    
    void viewInfoAboutStudent(String studentId) {
    	System.out.println(Data.getInstance().getStudentInfo(studentId));
    }
    void viewInfoAboutTeachers(String teacherId) {
    	System.out.println(Data.getInstance().getTeacherInfo(teacherId));
    };
    void adminNews(ActionType actionType , ) {
    	if(actionType == ActionType.ADDING) {
    		Data.getInstance().newsSet.add(n);
    	}
    			
    }
    void makeStatistic();
    
    void viewRequests();
}

