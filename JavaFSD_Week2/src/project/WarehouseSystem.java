package project;

import java.util.*;
import java.util.concurrent.*;

public class WarehouseSystem {
	public static void main(String[] args) {
		InventoryManager manager = new InventoryManager();

		// Initialize inventory
		manager.addProduct(new Product("P1", "Laptop", 10, new Location(1, 2, 3)));
		manager.addProduct(new Product("P2", "Smartphone", 5, new Location(2, 3, 1)));

		// Create orders
		manager.placeOrder(new Order("O1", Arrays.asList("P1", "P2"), Order.Priority.EXPEDITED));
		manager.placeOrder(new Order("O2", Arrays.asList("P1"), Order.Priority.STANDARD));

		// Process orders concurrently
		manager.processOrders();
	}
}

// Product class representing an item in inventory
class Product {
	private final String productID;
	private final String name;
	private int quantity;
	private final Location location;

	public Product(String productID, String name, int quantity, Location location) {
		this.productID = productID;
		this.name = name;
		this.quantity = quantity;
		this.location = location;
	}

	public synchronized void reduceStock(int qty) throws OutOfStockException {
		if (quantity < qty) {
			throw new OutOfStockException("Product " + name + " is out of stock!");
		}
		quantity -= qty;
	}

	public String getProductID() {
		return productID;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public Location getLocation() {
		return location;
	}
}

// Location class representing a storage location in warehouse
class Location {
	private final int aisle, shelf, bin;

	public Location(int aisle, int shelf, int bin) {
		this.aisle = aisle;
		this.shelf = shelf;
		this.bin = bin;
	}

	@Override
	public String toString() {
		return "Aisle: " + aisle + ", Shelf: " + shelf + ", Bin: " + bin;
	}
}

// Custom Exception for Out of Stock situations
@SuppressWarnings("serial")
class OutOfStockException extends Exception {
	public OutOfStockException(String message) {
		super(message);
	}
}

// Order class with Priority levels
class Order implements Comparable<Order> {
	private final String orderID;
	private final List<String> productIDs;
	private final Priority priority;

	public enum Priority {
		STANDARD, EXPEDITED
	}

	public Order(String orderID, List<String> productIDs, Priority priority) {
		this.orderID = orderID;
		this.productIDs = productIDs;
		this.priority = priority;
	}

	public List<String> getProductIDs() {
		return productIDs;
	}

	public String getOrderID() {
		return orderID;
	}

	public Priority getPriority() {
		return priority;
	}

	@Override
	public int compareTo(Order other) {
		return other.priority.compareTo(this.priority); // Higher priority first
	}
}

// Inventory Manager with thread-safe operations
class InventoryManager {
	private final ConcurrentHashMap<String, Product> inventory = new ConcurrentHashMap<>();
	private final PriorityBlockingQueue<Order> orderQueue = new PriorityBlockingQueue<>();

	public void addProduct(Product product) {
		inventory.put(product.getProductID(), product);
	}

	public void placeOrder(Order order) {
		orderQueue.add(order);
	}

	public void processOrders() {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		while (!orderQueue.isEmpty()) {
			Order order = orderQueue.poll();
			if (order != null) {
				executor.execute(() -> fulfillOrder(order));
			}
		}
		executor.shutdown();
	}

	private void fulfillOrder(Order order) {
		try {
			for (String productId : order.getProductIDs()) {
				Product product = inventory.get(productId);
				if (product != null) {
					product.reduceStock(1); // Assume 1 per order for simplicity
				}
			}
			System.out.println("Order " + order.getOrderID() + " fulfilled.");
		}
		catch (OutOfStockException e) {
			System.out.println("Order " + order.getOrderID() + " failed: " + e.getMessage());
		}
	}
}
