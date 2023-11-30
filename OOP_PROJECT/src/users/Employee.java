package users;

import java.util.HashMap;
import java.util.Map;
import other.Message;



public abstract class Employee extends User {
	double salary;
    Map<Employee, Message> receivedMessages;

    public Employee(String id ,String fullName, double salary) {
        super(id, fullName);
        this.salary = salary;
        this.receivedMessages = new HashMap<>();
    }
    
	void readMessages(Employee sender) {
    	 for (Map.Entry<Employee, Message> entry : receivedMessages.entrySet()) {
             if (entry.getKey() == sender) {
                 System.out.println(entry.getValue().getContent());
             }
         }
	}
    void receiveMessage(Employee employee ,Message message) {
    	receivedMessages.put(employee, message);
    }
    void sendMessage(Employee recipient, String message) {
    	Message m = new Message(this, message);
        recipient.receiveMessage(this, m);
    };
}
