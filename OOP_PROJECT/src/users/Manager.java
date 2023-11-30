package users;

public class Manager extends Employee {
    
    public Manager(String id, String name, double salary) {
    	super(name, id , salary);
    }
    
    
	void addCoursesForRegistration(Course course);
    void adminNews(String actionType) {
    	if() {}
    		
    		
    };
    
    void makeStatistic();
    void registerStudent(Student student, Course course);
    void viewInfoAboutStudent(SortingType sortingType);
    void viewInfoAboutTeachers(SortingType sortingType);
    void viewRequests();
}

