package users;

import users.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Enums.ActionType;
import Enums.Faculty;
import Enums.ResearchActionType;
import Enums.Semester;
import Research.CanDoResearch;
import Research.ResearchPaper;
import Research.ResearchProject;
import Research.Researcher;
import Research.ResearcherType;
import other.Course;
import other.CourseGrade;
import other.Grade;
import other.Lesson;
import other.Mark;
import other.Schedule;
import other.Transcript;

public class Student extends User implements CanDoResearch {
    Faculty faculty;
    Date enrollmentDate;
    int yearOfStudy;
    ResearcherType researcherType = ResearcherType.NON_RESEARCHER;
    StudentOrganization studentOrganization;
    List<Mark> marks = new ArrayList<>();
    Schedule schedule = new Schedule();
    Set<CourseGrade> courseGrades = new HashSet<>();
    Transcript trans = new Transcript();
    Researcher researcher = new Researcher();
    
    
    public Student() {}
    public Student(String string, String string2) {}
    
	public Student(String id ,String fullName ,Faculty faculty, Date enrollmentDate, int yearOfStudy, String password) {
		super(id , fullName, password);
		this.faculty = faculty;
		this.enrollmentDate = enrollmentDate;
		this.yearOfStudy = yearOfStudy;
	}

	
	public void viewSchedule() {
        schedule.seeSchedule();
    }
	
	public void addLessonToSchedule(Lesson lesson) {
        if(Data.getInstance().acsess == "Yes") {
			schedule.lessons.add(lesson);
        }
        else {
        	System.out.println("No acsess");
        }
    }

    public void removeLessonFromSchedule(Lesson lesson) {
        schedule.lessons.remove(lesson);
    }
	
    public void addCourseSemesterGrade(String courseCode, Semester semester , Grade grade) {
        for(CourseGrade cg : courseGrades) {	
    		if(cg.courseCode == courseCode) {	
        		cg.courseGrade.put(semester , grade);
        
    		}
        }
    }
	
    void seeMarks() {
    	System.out.print(marks);
    }
    void seeTeacherInfo(String id) {
    	System.out.print(Data.getInstance().getTeacherInfo(id));
         
    }
    
    void seeTeachers() {
        System.out.println("Teachers in Your Schedule");
        System.out.println("--------------------------");

        for (Lesson lesson : schedule.lessons) {
            Teacher teacher = lesson.teacher;

            if (teacher != null) {
                System.out.println("Lesson: " + lesson.lessonName);
                System.out.println("Teacher: " + teacher.getFullName());
                System.out.println("------------------------------");
            }
        }

        System.out.println("------------------------------");
    }
    
    StudentOrganization getStudentOrganization() {
    	return studentOrganization;
    };
   
    public void addMark(Mark mark) {
    	marks.add(mark);
    }
    public void seeTranscript() {
    	trans.viewTranscript();
    }
    
    
    public void createResearchPaper(String title, String authors, int page, String text) {
        ResearchPaper newPaper = new ResearchPaper(title, authors, page);
        newPaper.setText(text);
        researcher.addResearchPaper(newPaper);    
    }
    public void conductResearch(ResearchPaper paper , ResearchActionType act) {
    	switch (act) {
        case ADD_PAPERS_TO_PROJECT:
            researcher.addResearchPaperToProject(paper);
            break;
        case REMOVE_PAPER:
            researcher.removeResearchPaper(paper);
            break;

        case ADD_PAPER:
            researcher.addResearchPaper(paper);
            break;
        case SHOW_RESEARCH_PROJETS:
        	researcher.printProjects(null);
        default:
            System.out.println("Invalid research action type");
            break;
    }
    	
    }
    
    
	public void BecomeResearcher() {
		researcherType = ResearcherType.RESEARCHER;
		
	}
	public Object getCourseGrades() {
		return courseGrades;
	}
	
}

