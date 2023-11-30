package users;

import java.sql.Date;
import java.util.List;

import javax.xml.crypto.Data;

import Enums.Faculty;
import Research.CanDoResearch;
import Research.ResearcherType;
import other.Course;
import other.Mark;
import other.Transcript;

public class Student extends User implements CanDoResearch {
    Faculty faculty;
    Date enrollmentDate;
    int yearOfStudy;
    ResearcherType researcherType = ResearcherType.NON_RESEARCHER;
    StudentOrganization studentOrganization;
    List<Mark> marks;
    
    Transcript trans = new Transcript();
    
    
    public Student(String id ,String fullName) {
		super(fullName, id);
	}
	public Student(String id ,String fullName ,Faculty faculty, Date enrollmentDate, int yearOfStudy) {
		super(id , fullName);
		this.faculty = faculty;
		this.enrollmentDate = enrollmentDate;
		this.yearOfStudy = yearOfStudy;
	}


	void registerToCourse(String courseCode) {
		
	};
    void seeMarks() {
    	System.out.print(marks);
    }
    void seeTeacherInfo(String id) {
    	System.out.print(Data.getInstanse().getTeacherInfo(id));
         
    }
    
    void seeTeachers();
    void seeTranscript();
    void viewSchedule();
    StudentOrganization getStudentOrganization();
   
    public void conductResearch();
    
	public void BecomeResearcher() {
		researcherType = ResearcherType.RESEARCHER; 
	}
}
