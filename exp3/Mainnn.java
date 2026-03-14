abstract class Shape {
    protected double dim1;
    protected double dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle extends Shape {
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class Mainnn {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 5);

        System.out.println("Rectangle area: " + r.area());
        System.out.println("Triangle area: " + t.area());
    }
}