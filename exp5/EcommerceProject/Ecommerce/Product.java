package Ecommerce;

public class Product {
    private String name;
    private double price;
    private String productId;

    public Product(String name, double price, String productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: $" + price);
    }

    public double getPrice() {
        return price;
    }
}