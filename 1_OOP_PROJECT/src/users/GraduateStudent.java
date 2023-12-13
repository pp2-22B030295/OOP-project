package users;

import java.util.Date;

import Enums.Degree;
import Enums.Faculty;

public class GraduateStudent extends Student {
	Degree educationDegree;
	
	
	public GraduateStudent() {}
	public GraduateStudent(String id, String fullName, Faculty faculty, Date enrollmentDate, Degree degree, int yearOfStudy,
			String password) {
		super(id, fullName, faculty, enrollmentDate, yearOfStudy, password);
		this.educationDegree = degree;
	}

	
	
	
}
