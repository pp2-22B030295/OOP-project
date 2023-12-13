package users;

import java.util.HashSet;

public class StudentOrganization {
    private HashSet<Student> members;
    private Student leader;
    private String name;

    public StudentOrganization(String name, Student leader) {
        this.name = name;
        this.leader = leader;
        this.members = new HashSet<>();
    }

    public void addMember(Student member) {
        members.add(member);
    }

    
    public HashSet<Student> getMembers() {
		return members;
	}

	public void setMembers(HashSet<Student> members) {
		this.members = members;
	}

	public Student getLeader() {
		return leader;
	}

	public void setLeader(Student leader) {
		this.leader = leader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
        return "Organization name: " + name + "\nLeader: " + leader.getFullName() + "\nMembers: \n" + members;
    }
    
    
}
