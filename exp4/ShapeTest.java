interface Shape {
    double area();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(10, 5);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}