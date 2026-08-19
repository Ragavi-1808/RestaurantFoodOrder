package Delivery;

public class Delivery {
    private String deliveryPerson;
    private String address;
    private String status;

    public Delivery(String deliveryPerson, String address, String status) {
        this.deliveryPerson = deliveryPerson;
        this.address = address;
        this.status = status;
    }

    public void displayDelivery() {
        System.out.println("Delivery Person: " + deliveryPerson);
        System.out.println("Address: " + address);
        System.out.println("Status: " + status);
    }
}
