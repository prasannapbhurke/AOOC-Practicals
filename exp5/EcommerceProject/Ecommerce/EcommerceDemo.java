package Ecommerce;

public class EcommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0, "P1001");
        Product p2 = new Product("Smartphone", 800.0, "P1002");

        Customer c1 = new Customer("Prasanna", 201);

        Order order1 = new Order(c1);
        order1.addProduct(p1);
        order1.addProduct(p2);

        System.out.println("=== E-commerce Order ===\n");
        order1.displayOrder();
    }
}