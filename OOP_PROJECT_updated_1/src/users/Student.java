package users;

import users.Data;

import java.util.Date;
import java.util.List;


import Enums.Faculty;
import Research.CanDoResearch;
import Research.ResearcherType;
import other.Course;
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
    List<Mark> marks;
    Schedule schedule = new Schedule();
    
    
    Transcript trans = new Transcript();
    
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
   
    void seeTranscript() {
    	trans.viewTranscript();
    };
    ---------------------------------------------------------------------Not Right
    public void addMarkToAttestation1(Mark mark) {
        marks.add(mark);
    }

    public void addMarkToAttestation2(Mark mark) {
        marks.add(mark);
    }
    ---------------------------------------------------------------------
    
    
    public void conductResearch();
    
    
	public void BecomeResearcher() {
		researcherType = ResearcherType.RESEARCHER; 
	}
}
