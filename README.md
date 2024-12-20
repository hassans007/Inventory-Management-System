# Inventory Management System - README

## Overview
This project implements a simple inventory management system with functionalities to place, update, cancel, track, and filter orders based on their status. The system uses two distinct `InventorySystem` objects to manage orders, with each order containing product details such as the product name, price, quantity, and order status.

### Key Features:
1. **Place Orders**: Allows placing new orders with relevant details such as product name, price, quantity, and status.
2. **Update Orders**: Updates the status or details of an existing order.
3. **Cancel Orders**: Allows cancellation of orders that exist in the inventory.
4. **Track Orders**: Tracks and displays the details of a specific order based on its ID.
5. **Filter Orders by Status**: Filters and prints orders based on their status (e.g., "Paid", "Shipped").
6. **Calculate Revenue**: Calculates the total revenue generated by the inventory by summing the price of each item ordered (quantity × product price).

## Components

### 1. **Order Class**
This class represents an individual order in the inventory system. It stores information about the order's ID, product name, product price, quantity, and status.

#### Constructor:
- `Order(int orderIds, String productName, double productPrice, int quantity, String status)`
  - Initializes an order object with the provided details.

#### Methods:
- `getOrderIds()`: Returns the order ID.
- `getProductName()`: Returns the name of the product.
- `getProductPrice()`: Returns the price of the product.
- `getQuantity()`: Returns the quantity of the product in the order.
- `getStatus()`: Returns the current status of the order.
- `toString()`: Provides a string representation of the order details.

### 2. **InventorySystem Class**
This class manages a collection of orders stored in a `HashMap`, where the order ID is the key and the `Order` object is the value. It allows for placing, updating, canceling, tracking orders, and filtering by order status.

#### Constructor:
- `InventorySystem()`: Initializes the `ordersMap` HashMap to store orders.

#### Methods:
- `placeOrder(Order order)`: Adds a new order to the inventory.
- `updateOrder(Order order)`: Updates an existing order if it exists in the inventory.
- `cancelOrder(int orderId)`: Cancels (removes) an order from the inventory if it exists.
- `trackOrder(int orderId)`: Retrieves and returns the details of an order by its ID.
- `getOrdersMap()`: Returns the entire `ordersMap`.
- `printOrdersByStatus(String assignedStatus)`: Prints all orders with the specified status.
  
### 3. **User Class (Main Program)**
This is the main class where two `InventorySystem` objects are created, and various actions are performed on these systems, such as placing orders, updating them, canceling orders, and calculating total revenue.

#### Key Actions:
- **Create Inventory Systems**: Two `InventorySystem` objects are instantiated.
- **Place Orders**: Orders are created and added to the respective inventories.
- **Update Orders**: Existing orders are updated by changing their statuses.
- **Cancel Orders**: Orders are canceled based on their ID.
- **Track Orders**: Specific orders are tracked using their order ID.
- **Print Orders by Status**: Orders with a specified status (e.g., "Paid") are printed.
- **Calculate Total Revenue**: The total revenue for each inventory is calculated by multiplying product prices with quantities ordered and then summing them up.

#### Methods:
- `calculateTotalRevenue(InventorySystem inventorySystem)`: Calculates the total revenue for the given `InventorySystem` by summing the value of each order (product price × quantity).

## Example Output
When the `User` class is executed, the program performs the following actions:

1. Places multiple orders in both inventory systems.
2. Updates the status of an order.
3. Cancels an order.
4. Tracks and prints details of specific orders.
5. Filters orders by a given status.
6. Calculates and displays the total revenue for each inventory.

