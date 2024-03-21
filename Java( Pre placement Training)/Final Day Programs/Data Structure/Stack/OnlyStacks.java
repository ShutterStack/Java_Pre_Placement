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

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full, cannot perform push operation.");
        } else {
            stack[++top] = element;
        }
    }

    public int pop() {
        int element = 0;
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot perform pop operation.");
        } else {
            element = stack[top--];
            return element;
        }
        return element;
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

public class OnlyStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        Stacks s1 = new Stacks();
        Stacks s2 = new Stacks();

        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            s1.push(sc.nextInt());
        }

        s1.traverse();

        int element;
        int midIndex = s1.top / 2;
        for (int i = 0; i < midIndex; i++) {
            element = s1.pop();
            s2.push(element);
        }
        s1.pop();

        while (!s2.isEmpty()) {
            element = s2.pop();
            s1.push(element);
        }

        System.out.println("After removing the middle element, the stack is as follows: ");
        s1.traverse();
    }
}
