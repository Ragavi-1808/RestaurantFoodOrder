package Restaurant;

public class Restaurant {
    String restaurantName;
    String foodName;
    int price;

    Restaurant(String restaurantName, String foodName, int price) {
        this.restaurantName = restaurantName;
        this.foodName = foodName;
        this.price = price;
    }

    void displayOrder() {
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Food: " + foodName);
        System.out.println("Price: " + price);
    }
}
