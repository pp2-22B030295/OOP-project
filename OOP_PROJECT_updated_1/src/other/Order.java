package other;

import Enums.OrderStatus;

public class Order {

	public Object orderId;
	String sender;
    String content;
    private OrderStatus status = OrderStatus.NotAccepted;
	
	public Order(String senderId, String content) {
		super();
		this.sender = senderId;
		this.content = content;
	}
	
	
	public String getSender() {
		return sender;
	}

	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public Object getOrderId() {
		return orderId;
	}


	public void setOrderId(Object orderId) {
		this.orderId = orderId;
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
	

    public OrderStatus getStatus() {
        return status;
    }

    public void AcceptOrder() {
        this.status = OrderStatus.Accepted;
    }

	public String toString() {
		return "Status: " + status + "\nMessage [From: " + sender + "]\ncontent=" + content;
	}
}

