package Restaurant;

public class Order {
    int orderId;
    String customerName;
    String foodName;
    int quantity;

    Order(int orderId, String customerName, String foodName, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodName = foodName;
        this.quantity = quantity;
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Name: " + foodName);
        System.out.println("Quantity: " + quantity);
    }
}
