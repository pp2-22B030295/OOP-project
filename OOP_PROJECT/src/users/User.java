package users;

public abstract class User {
	String fullName;
	String id;
	
	public User(){}
	public User(String id ,String fullName) {
		this.fullName = fullName;
		this.id = id;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	void seeNews() {
		
	};
	
	
	public String toString () {
		return "Id: " + id + " FullName: " + fullName;
	}
	
	
	
}
