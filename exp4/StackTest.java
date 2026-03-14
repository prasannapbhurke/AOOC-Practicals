interface Stack {
    int size = 5;
    void push(int data);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    private int[] arr = new int[size];
    private int top = -1;

    public void push(int data) {
        if (overflow()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
        System.out.println(data + " pushed");
    }

    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = arr[top--];
        System.out.println(val + " popped");
        return val;
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

public class StackTest {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        s.pop();
        s.display();

        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.display();
    }
}