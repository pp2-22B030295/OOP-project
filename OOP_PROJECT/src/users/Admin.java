package users;

import java.util.List;

import Enums.ActionType;

public class Admin extends Employee {
    public Admin(String id, String fullName, double salary) {
		super(id, fullName, salary);
	}
    
	void adminUser(User user, ActionType action);
	
	
	void seeUserActions(List<String> userActions) {
        System.out.println("User Actions:");
        for (String action : userActions) {
            System.out.println(action);
        }
    }
}
