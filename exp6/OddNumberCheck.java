import java.util.Scanner;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberCheck {
    public static void checkEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("The number " + num + " is odd.");
        }
        System.out.println("The number " + num + " is even.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        try {
            checkEven(number);
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        sc.close();
    }
}