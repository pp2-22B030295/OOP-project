package users;
import java.util.HashSet;

import Enums.Faculty;
import Research.CanDoResearch;
import Research.ResearcherType;
import other.Course;

public class Teacher extends Employee implements CanDoResearch {
	HashSet<Course> courses;
    ResearcherType researcherType = ResearcherType.NON_RESEARCHER;
    
    public Teacher(String id, String fullName, double salary) {
		super(id, fullName, salary);
	}
    
    void assignGrade(Student student, Course course, Mark mark);
    void seeStudentInfo(Student student);
    void seeStudentInCourse(Course course);
    void submitComplaint(List<Student> students, UrgencyLevel urgency);
    void workWithCourse(Course course);
   
    public void conductResearch();

	public void BecomeResearcher() {
		researcherType = ResearcherType.RESEARCHER;
	}
}
