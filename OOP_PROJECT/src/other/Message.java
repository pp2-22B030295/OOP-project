package other;

import users.Employee;

public class Message {
    String sender;
    String content;
	
	public Message(String senderId, String content) {
		super();
		this.sender = senderId;
		this.content = content;
	}
	
	
	public String getSender() {
		return sender;
	}


	public void setSender(String senderId) {
		this.sender = sender;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String toString() {
		return "Message [From: " + sender + "]\ncontent=" + content;
	}
    
}
