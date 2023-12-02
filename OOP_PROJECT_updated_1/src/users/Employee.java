package users;

import java.util.HashMap;
import java.util.Map;

import other.Message;

public abstract class Employee extends User {
    double salary;
    Map<String, Message> receivedMessages;
    
    public Employee() {}
    public Employee(String id, String fullName, double salary , String password) {
        super(id, fullName , password);
        this.salary = salary;
        this.receivedMessages = new HashMap<>();
    }

    void readMessages(String sender) {
        for (Map.Entry<String, Message> entry : receivedMessages.entrySet()) {
            if (entry.getKey().equals(sender)) {
                System.out.println(entry.getValue().getContent());
            }
        }
    }

    void receiveMessage(String employeeId, Message message) {
        receivedMessages.put(employeeId, message);
    }

    void sendMessage(Employee recipient, String message) {
        Message m = new Message(id, message);
        recipient.receiveMessage(id, m);
    }
}
