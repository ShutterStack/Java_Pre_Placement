import java.util.Scanner;

class Stacks {
    final int capacity = 10;
    int top = -1;
    int stack[] = new int[capacity];
    Scanner sc = new Scanner(System.in);

    public boolean isFull() {
        if (top >= (capacity - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push() {
        if (isFull()) {
            System.out.println("Stack is full, cannot perform push operation.");
        } else {
            System.out.println("Enter the element to be inserted: ");
            int element = sc.nextInt();
            stack[++top] = element;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot perform pop operation.");
        } else {
            int element = stack[top--];
            System.out.println("The popped element is: " + element);
        }
    }

    public void peek() {
        int element = stack[top];
        System.out.println("The element at the top of the stack is: " + element);
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Cannot traverse the stack, the stack is currently empty.");
        } else {
            System.out.println("The stack elements are as follows: ");
            for (int i = top; i >= 0; i--) {
                if (i == top) {
                    System.out.println(stack[i] + " <--Top");
                } else {
                    System.out.println(stack[i]);
                }
            }
            System.out.println();
        }
    }
}

class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacks stack = new Stacks();
        int choice;
        while (true) {
            System.out.println("Enter the operation to be performed: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stack.push();
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.traverse();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
        // sc.close();
    }
}