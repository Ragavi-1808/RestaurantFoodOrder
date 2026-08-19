import Restaurant.Restaurant;
import Restaurant.Order;
import Delivery.Delivery;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("ABC Restaurant", "Pizza", 250);
        Order order = new Order(101, "Ragavi", "Pizza", 2);
        Delivery delivery = new Delivery("Arun", "Chennai", "Out for Delivery");

        restaurant.displayOrder();

        System.out.println();

        order.displayOrder();

        System.out.println();

        delivery.displayDelivery();
    }
}
