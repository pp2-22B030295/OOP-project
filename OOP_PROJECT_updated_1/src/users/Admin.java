package users;

import java.util.List;

import Enums.ActionType;

public class Admin extends Employee {
	public Admin() {}
    public Admin(String id, String fullName, double salary, String password) {
		super(id, fullName, salary, password);
	}
    
	void adminUser(User user, ActionType action);
	
	
	void seeUserActions(List<String> userActions) {
        System.out.println("User Actions:");
        for (String action : userActions) {
            System.out.println(action);
        }
    }
}
