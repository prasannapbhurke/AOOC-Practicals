package Ecommerce;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void displayOrder() {
        customer.displayCustomer();
        System.out.println("Ordered Products:");
        for (Product p : products) {
            p.displayProduct();
            System.out.println();
        }
        System.out.println("Total Cost: $" + calculateTotal());
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}