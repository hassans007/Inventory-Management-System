package Practical_17;

import java.util.HashMap;

public class InventorySystem {

    // HashMap to store orders with order ID as the key and Order object as the value
    private HashMap<Integer, Order> ordersMap;

    // Constructor to initialize the HashMap when an InventorySystem object is created
    public InventorySystem(){
        this.ordersMap = new HashMap<>();
    }

    //Places a new order in the system
    public void placeOrder(Order order) {
        // Putting the order in the HashMap, using order ID as the key
        ordersMap.put(order.getOrderIds(), order);
    }

    //Updates an existing order in the system
    public void updateOrder(Order order) {
        // Checking if the order with the given ID exists in the HashMap
        if (ordersMap.containsKey(order.getOrderIds())) {
            // If exists, update the order by putting the new Order object with the same ID
            ordersMap.put(order.getOrderIds(), order);
        } else {
            // If not found, print a message indicating that the order is not found for update
            System.out.println("Sorry this orderId: " + order.getOrderIds() + " do not exists, Update not possible!!");
        }
    }

    // Cancels an existing order in the system
    public void cancelOrder(int orderId) {
        // Checking if the order with the given ID exists in the HashMap
        if (ordersMap.containsKey(orderId)) {
            // If exists, remove the order from the HashMap
            ordersMap.remove(orderId);
        } else {
            // If not found, print a message indicating that the order is not found for cancellation
            System.out.println("Order with ID " + orderId + " do not exists, Cancellation not possible!!");
        }
    }

    //Tracks an order based on its ID
    public Order trackOrder(int orderId) {
        // Retrieve and return the Order object associated with the given ID from the HashMap
        return ordersMap.get(orderId);
    }

    // Getter method to retrieve the entire orders map
    public HashMap<Integer, Order> getOrdersMap() {
        return ordersMap;
    }

    //Prints a list of orders with a specific status
    public void printOrdersByStatus(String assignedStatus) {
        // Print a header indicating the status being searched, This is case-sensitive!!
        System.out.println("-------------------------------------------");
        System.out.println("Orders with Status " + assignedStatus + ":");

        // Iterate through all orders in the HashMap
        for (Order order : ordersMap.values()) {
            // Check if the order's status matches the assignedStatus
            if (order.getStatus().equalsIgnoreCase(assignedStatus)) {
                // If found, print the order details
                System.out.println(order);
            }
        }
    }
}
