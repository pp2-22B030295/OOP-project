package users;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import other.Order;

public class TechSupportSpecialist extends Employee {

    public TechSupportSpecialist() {}

    public TechSupportSpecialist(String id, String fullName, double salary, String password) {
        super(id, fullName, salary, password);
    }

    // View orders
    public void viewOrders() {
    	HashSet<Order> orders = Data.getInstance().getOrders();
        if (orders.isEmpty()) {
            System.out.println("No orders available.");
        } else {
            System.out.println("Tech Support Orders:");
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }

    public void acceptOrder(String orderId) {
        Order order = findOrderById(orderId);
        if (order != null) {
            order.AcceptOrder();
            System.out.println("Order accepted:\n" + order);
        } else {
            System.out.println("Order not found.");
        }
    }

    // Delete an order by ID
    public void deleteOrder(String orderId) {
        Order order = findOrderById(orderId);
        HashSet<Order> orders = Data.getInstance().getOrders();
        if (order != null) {
            orders.remove(order);
            System.out.println("Order deleted:\n" + order);
        } else {
            System.out.println("Order not found.");
        }
    }

    private Order findOrderById(String orderId) {
    	
    	HashSet<Order> orders = Data.getInstance().getOrders();
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }
}
