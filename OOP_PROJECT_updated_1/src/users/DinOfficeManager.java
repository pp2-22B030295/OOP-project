package users;

import Enums.Faculty;

public class DinOfficeManager extends Manager{
	Faculty faculty;
	public DinOfficeManager(String id, String name, double salary , Faculty faculty, String password) {
		super(id, name, salary, password);
		this.faculty = faculty;
	}
	
	

}
