import java.util.Scanner;

class Stack {
    int[] arr;
    int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == arr.length - 1)
            System.out.println("Stack Overflow");
        else
            arr[++top] = x;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + arr[top--]);
    }

    void display() {
        if (top == -1)
            System.out.println("Stack Empty");
        else {
            for (int i = top; i >= 0; i--)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

class Queue {
    int[] arr;
    int front, rear;

    Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int x) {
        if (rear == arr.length - 1)
            System.out.println("Queue Overflow");
        else
            arr[++rear] = x;
    }

    void dequeue() {
        if (front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println("Deleted: " + arr[front++]);
    }

    void display() {
        if (front > rear)
            System.out.println("Queue Empty");
        else {
            for (int i = front; i <= rear; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack(5);
        Queue queue = new Queue(5);

        while (true) {
            System.out.println("1.Push 2.Pop 3.Display Stack");
            System.out.println("4.Enqueue 5.Dequeue 6.Display Queue 7.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    queue.enqueue(sc.nextInt());
                    break;
                case 5:
                    queue.dequeue();
                    break;
                case 6:
                    queue.display();
                    break;
                case 7:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}