package users;

import java.sql.Date;

import Enums.Faculty;

public class UsersFactory {
	

    public static Student createStudent(String id ,String fullName , Date enrollmentDate , Faculty faculty, int yearOfStudy) {
    	return new Student(id , fullName , faculty , enrollmentDate , yearOfStudy);
    }

    public static Teacher createTeacher(String id , String fullName , double salary) {
        return new Teacher(id, fullName, salary);
    }

    public static Manager createManager(String id, String fullName, double salary) {
        return new Manager(id , fullName , salary);
    }

    public static ORManager createORManager(String name) {
        return new ORManager();
    }

    public static DinOfficeManager createDinOfficeManager(String name) {
        return new DinOfficeManager();
    }

    public static TechSupportSpecialist createTechSupportSpecialist(String name) {
        return new TechSupportSpecialist();
    }
}