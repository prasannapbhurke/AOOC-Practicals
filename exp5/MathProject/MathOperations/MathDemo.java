package MathOperations;

public class MathDemo {
    public static void main(String[] args) {
        double num1 = 12.7;
        double num2 = 5.3;

        Floor f = new Floor();
        Ceil c = new Ceil();
        Round r = new Round();

        System.out.println("Number 1: " + num1);
        System.out.println("Floor: " + f.compute(num1));
        System.out.println("Ceil: " + c.compute(num1));
        System.out.println("Round: " + r.compute(num1));

        System.out.println("\nNumber 2: " + num2);
        System.out.println("Floor: " + f.compute(num2));
        System.out.println("Ceil: " + c.compute(num2));
        System.out.println("Round: " + r.compute(num2));
    }
}