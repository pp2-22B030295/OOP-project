package users;

import java.util.HashSet;

public class StudentOrganization {
	HashSet<Student> members;
    Student leader;
    String name;
	public StudentOrganization(String name , String leader) {
		super();
		this.name = name;
	}
	
	public void addMember(Student member) {
		members.add(member);
	}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		return "Organisation name: " + name + " Lader: " + leader.fullName + " \nMembers: \n" + members;
	}
    
	
}
