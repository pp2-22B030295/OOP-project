package users;

public abstract class User {
	String fullName;
	String id;
	private String password;
	public User(){}
	public User(String id ,String fullName , String passord) {
		this.fullName = fullName;
		this.id = id;
		this.password = password;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
