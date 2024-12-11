package Practical_17;

// Class representing an order with order details
public class Order {

    //Stores order information
    private int orderIds;
    private String productName;
    private double productPrice;
    private int quantity;
    private String status;

    // Constructor to initialize an Order object with provided details
    public Order(int orderIds, String productName, double productPrice, int quantity, String status) {
        this.orderIds = orderIds;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.status = status;
    }

    // Getter method to retrieve the order ID
    public int getOrderIds() {
        return orderIds;
    }

    // Getter method to retrieve the order status
    public String getStatus() {
        return status;
    }

    // Getter method to retrieve the product name
    public String getProductName() {
        return productName;
    }

    // Getter method to retrieve the product price
    public double getProductPrice() {
        return productPrice;
    }

    // Getter method to retrieve the quantity of items
    public int getQuantity() {
        return quantity;
    }

    // Override the toString method to provide a human-friendly representation of the Order object
    @Override
    public String toString() {
        return "Order{" +
                "orderIds=" + orderIds +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}
