package users;
import java.util.HashSet;

import Enums.Faculty;
import Research.CanDoResearch;
import Research.ResearcherType;
import other.Course;

public class Teacher extends Employee implements CanDoResearch {
	HashSet<Course> courses;
    ResearcherType researcherType = ResearcherType.NON_RESEARCHER;
    
    public Teacher() {}
    public Teacher(String id, String fullName, double salary, String password) {
		super(id, fullName, salary, password);
	}
    
    void assignGrade(String studentId, String courseCode, Mark mark) {
    	
    };
    void seeStudentInfo(String studentId);
    void seeStudentInCourse(String courseCode);
    void submitComplaint(String studentId, UrgencyLevel urgency);
    void workWithCourse(Course course);
   
    public void conductResearch();

	public void BecomeResearcher() {
		researcherType = ResearcherType.RESEARCHER;
	}
}
