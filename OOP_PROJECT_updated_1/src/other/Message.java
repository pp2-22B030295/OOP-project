package other;


public class Message {
    String sender;
    String content;
	
	public Message(String employee, String content) {
		super();
		this.sender = employee;
		this.content = content;
	}
	
	
	public String getSender() {
		return sender;
	}


	public void setSender(String senderId) {
		this.sender = senderId;
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
