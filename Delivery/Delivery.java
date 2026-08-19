package Delivery;

public class Delivery {
    String deliveryPerson;
    String address;
    String status;

    Delivery(String deliveryPerson, String address, String status) {
        this.deliveryPerson = deliveryPerson;
        this.address = address;
        this.status = status;
    }

    void displayDelivery() {
        System.out.println("Delivery Person: " + deliveryPerson);
        System.out.println("Address: " + address);
        System.out.println("Status: " + status);
    }
}
