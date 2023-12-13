package users;

import java.util.List;

import Enums.ActionType;

public class Admin extends User{
	String id;
	String fullName;
	double salary;
	String password;
    public Admin() {}
	public Admin(String id, String fullName, double salary, String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.salary = salary;
		this.password = password;
	}

	void adminUser(User user, ActionType action) {
        switch (action) {
            case ADDING:
                addUser(user);
                break;
            case REMOVING:
                removeUser(user.getId());
                break;
            case UPDATING:
                updateUser(user);
                break;
        }
    }

    void addUser(User user) {
        if (Data.getInstance().findUserById(user.getId()) == null) {
            if (user instanceof Student) {
                Data.getInstance().getStudents().add((Student) user);
            } else if (user instanceof Teacher) {
                Data.getInstance().getTeachers().add((Teacher) user);
            } else if (user instanceof Manager) {
                Data.getInstance().getManagers().add((Manager) user);
            } else if (user instanceof ORManager) {
                Data.getInstance().getOrManagers().add((ORManager) user);
            } else if (user instanceof DinOfficeManager) {
                Data.getInstance().getDinOfficeManagers().add((DinOfficeManager) user);
            } else if (user instanceof TechSupportSpecialist) {
                Data.getInstance().getTechSupportSpecialists().add((TechSupportSpecialist) user);
            } else if (user instanceof GraduateStudent) {
                Data.getInstance().getGraduateStudents().add((GraduateStudent) user);
            } else if (user instanceof Admin) {
                Data.getInstance().getAdmins().add((Admin) user);
            }
        } else {
            System.out.println("User with ID " + user.getId() + " already exists.");
        }
    }

    void removeUser(String userId) {
        User userToRemove = Data.getInstance().findUserById(userId);
        if (userToRemove != null) {
            if (userToRemove instanceof Student) {
                Data.getInstance().getStudents().remove(userToRemove);
            } else if (userToRemove instanceof Teacher) {
                Data.getInstance().getTeachers().remove(userToRemove);
            } else if (userToRemove instanceof Manager) {
                Data.getInstance().getManagers().remove(userToRemove);
            } else if (userToRemove instanceof ORManager) {
                Data.getInstance().getOrManagers().remove(userToRemove);
            } else if (userToRemove instanceof DinOfficeManager) {
                Data.getInstance().getDinOfficeManagers().remove(userToRemove);
            } else if (userToRemove instanceof TechSupportSpecialist) {
                Data.getInstance().getTechSupportSpecialists().remove(userToRemove);
            } else if (userToRemove instanceof GraduateStudent) {
                Data.getInstance().getGraduateStudents().remove(userToRemove);
            } else if (userToRemove instanceof Admin) {
                Data.getInstance().getAdmins().remove(userToRemove);
            }
        } else {
            System.out.println("User with ID " + userId + " not found.");
        }
    }

    void updateUser(User updatedUser) {
        User existingUser = Data.getInstance().findUserById(updatedUser.getId());
        if (existingUser != null) {
        	-----
        	//Для каждого User нужен один иф с каждым филдом из конструктора
        	//Создать в тест класс у админа Класс нужный для адд метода и заполнять его а после добавить его в дата
            existingUser.setFullName(updatedUser.getFullName());
            existingUser.setPassword(updatedUser.getPassword());
        } else {
            System.out.println("User with ID " + updatedUser.getId() + " not found.");
        }
    }
    

}
