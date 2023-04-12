package PresSpringXML;

public class Order {
    private Integer id;
    private String description;
    private Double price;

    public Order(Integer id, String description, Double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", description: " + description + ", price: " + price;
    }
}