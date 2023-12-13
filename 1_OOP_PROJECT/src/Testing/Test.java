package Testing;

import Enums.ActionType;
import Enums.Degree;
import Enums.Faculty;
import Research.ResearcherType;
import other.Course;
import other.Mark;
import users.Admin;
import users.DinOfficeManager;
import users.GraduateStudent;
import users.ORManager;
import users.Student;
import users.StudentOrganization;
import users.Teacher;
import users.TechSupportSpecialist;
import users.User;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import users.Data;

public class Test {

	public static void main(String[] args) {


        Admin admin11 = new Admin("adminId", "Admin Name", 50000.0 , "admin_id");
        DinOfficeManager dinOfficeManager11 = new DinOfficeManager("managerId", "Manager Name", 45000.0, Faculty.FIT , "din_id");
        GraduateStudent graduateStudent11 = new GraduateStudent("studentId", "Student Name", Faculty.FIT , new Date(System.currentTimeMillis()) , Degree.Master , 0, "graduate_id");
        ORManager orManager11 = new ORManager("orManagerId", "OR Manager Name", 55000.0 , "ORmanager_id");
        Student student11 = new Student("studentId", "Student Name", Faculty.FIT, new Date(System.currentTimeMillis()), 2 , "student");
        Teacher teacher11 = new Teacher("teacherId", "Teacher Name", 60000.0, "teacher_id");
        TechSupportSpecialist techSupportSpecialist11 = new TechSupportSpecialist("techSupportId", "Tech Support Name", 48000.0 , "techSupport_id");
        Student leader11 = new Student("leader_id", "Leader Full Name" , Faculty.FAM, new Date(System.currentTimeMillis()), 3, "leader_id");
        StudentOrganization organization11 = new StudentOrganization("Organization Name", leader11);

        Student member1 = new Student("member1_id", "Member 1 Full Name");
        organization11.addMember(member1);
        
        Data.getInstance().getAdmins().add(admin11);
        Data.getInstance().getDinOfficeManagers().add(dinOfficeManager11);
        Data.getInstance().getGraduateStudents().add(graduateStudent11);
        Data.getInstance().getOrManagers().add(orManager11);
        Data.getInstance().getStudents().add(student11);
        Data.getInstance().getTeachers().add(teacher11);
        Data.getInstance().getTechSupportSpecialists().add(techSupportSpecialist11);
		
        
		System.out.println("Добро пожаловать в прототип wsp\nДля входа введите логин и пароль");
		System.out.print("Логин(User id):");
		Scanner passwordInput = new Scanner(System.in);
		String password = passwordInput.nextLine();
		System.out.print("Пароль:");
		Scanner loginInput = new Scanner(System.in);
		String login = loginInput.nextLine();
		
		User user = Data.getInstance().findUserById(login);
		
		if (user != null) {
		    if (user.getPassword().equals(password)) {
		        System.out.println("Login Successful!");

		        if (user instanceof Student) {
		            Student student = (Student) user;
		            while (true) {
		                System.out.println("Choose an action for the Student:");
		                System.out.println("1. Change Password");
		                System.out.println("2. View courses");
		                System.out.println("3. View teachers");
		                System.out.println("4. View schedule");
		                System.out.println("5. View transcript");
		                System.out.println("6. Add lesson to schedule");
		                System.out.println("7. View marks");
		                System.out.println("7. ");
		                System.out.println("7. Logoout");
		                System.out.println("7. Logoout");
		                System.out.println("7. Logoout");
		                System.out.println("7. Logoout");

		                Scanner choiceInput = new Scanner(System.in);
		                int choice = choiceInput.nextInt();

		                switch (choice) {
		                    case 1:
		                    	
		                        break;
		                    case 2:
		                        break;
		                    case 3:
		                        break;
		                    case 4:
		                        break;
		                    case 5:
		                        break;
		                    default:
		                        System.out.println("Invalid choice. Please try again.");
		                }
		            }
		        }
		        if (user instanceof Admin) {
                    Admin admin = (Admin) user;
                    while (true) {
                        System.out.println("Choose an action for the Admin:");
                        System.out.println("1. Add User");
                        System.out.println("2. Remove User");
                        System.out.println("3. Update User");
                        System.out.println("4. Logout");

                        Scanner choiceInput = new Scanner(System.in);
                        int choice = choiceInput.nextInt();
                        
                        switch (choice) {
                            case 1:
                            	System.out.print("ВВедите полное имя");
                            	Scanner n = new Scanner(System.in);
                                String fullName = n.nextLine();
                                System.out.print("ВВедите ID");
                            	Scanner i = new Scanner(System.in);
                                String id = i.nextLine();
                                System.out.print("ВВедите пароль");
                            	Scanner p = new Scanner(System.in);
                                String pas = p.nextLine();
                                System.out.print("Кого создать - студент/учитель/менеджера деканат/ОР менеджер/админ/тех специалист/студент выпускник");
                            	Scanner userChoice = new Scanner(System.in);
                                String uc = userChoice.nextLine();
                                //для каждого юзера человека иф со стрингом где делается выбор юзера для создания дальше систем ауты с каждым филдом для конструктора этого юзера со сканером
                                if(uc == "student") {
                                	Student addingUser = new Student(id , fullName);//password  конце добавить системы для других филдов;
                                }
                                admin.addUser(addingUser);
                                break;
                            case 2:
                                admin.removeUser();
                                break;
                            case 3:
                                admin.updateUser();
                                break;
                            case 4:
                                System.out.println("Logging out...");
                                return;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }
		        }
		        if (user instanceof ORManager) {
		        	ORManager ORManager = (ORManager) user;
		            while (true) {
		                System.out.println("Choose an action for the ORManager:");
		                


		                Scanner choiceInput = new Scanner(System.in);
		                int choice = choiceInput.nextInt();

		                switch (choice) {
		                    case 1:
		                        break;
		                    case 2:
		                        break;
		                    case 3:
		                        break;
		                    case 4:
		                        break;
		                    case 5:
		                        break;
		                    default:
		                        System.out.println("Invalid choice. Please try again.");
		                }
		            }
		        }
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		    }	 
		    else {
		        System.out.println("Incorrect Password. Login Failed.");
		    }
		} else {
		    System.out.println("User not found. Login Failed.");
		}
		
	}
}