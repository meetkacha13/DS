import java.util.Scanner;

public class Stack_Switch {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack_Switch(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top];
    }

    public void change(int x) {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }
        arr[top] = x;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int size = sc.nextInt();
        Stack_Switch stack = new Stack_Switch(size);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Change");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("enter new element : ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    int peekedElement = stack.peek();
                    if (peekedElement != -1) {
                        System.out.println("Peeked element: " + peekedElement);
                    }
                    break;
                case 5:
                	System.out.println("enter change element : ");
                    int newElement = sc.nextInt();
                    stack.change(newElement);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}
