package users;

import java.sql.Date;

import Enums.Faculty;

public class UsersFactory {
	
	public UsersFactory() {}
    public static Student createStudent(String id ,String fullName , Date enrollmentDate , Faculty faculty, int yearOfStudy , String password) {
    	return new Student(id , fullName , faculty , enrollmentDate , yearOfStudy , password);
    }

    public static Teacher createTeacher(String id , String fullName , double salary , String password) {
        return new Teacher(id, fullName, salary , password);
    }

    public static ORManager createORManager(String id , String fullNme , double salary, String password) {
        return new ORManager(id, fullNme, salary , password);
    }

    public static DinOfficeManager createDinOfficeManager(String id ,String fullName , double salary , Faculty faculty, String password) {
        return new DinOfficeManager(id, fullName, salary , faculty , password);
    }

    public static TechSupportSpecialist createTechSupportSpecialist(String id , String fullName , double salary , String password) {
        return new TechSupportSpecialist(id, fullName, salary , password);----
    }
}