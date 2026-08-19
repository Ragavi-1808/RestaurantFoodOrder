package Restaurant;

public class Restaurant {
    private String restaurantName;
    private String foodName;
    private int price;

    public Restaurant(String restaurantName, String foodName, int price) {
        this.restaurantName = restaurantName;
        this.foodName = foodName;
        this.price = price;
    }

    public void displayOrder() {
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Food: " + foodName);
        System.out.println("Price: " + price);
    }
}
