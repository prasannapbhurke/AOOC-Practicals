public class StaticDemo {
    static int count;
    static String message;

    static {
        count = 0;
        message = "Static block executed";
        System.out.println(message);
    }

    public StaticDemo() {
        count++;
    }

    static void showCount() {
        System.out.println("Objects created: " + count);
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
        StaticDemo.showCount();
    }
}