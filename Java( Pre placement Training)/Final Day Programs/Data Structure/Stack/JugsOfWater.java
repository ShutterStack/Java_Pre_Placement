import java.util.Scanner;

class Stacks {
    Stacks(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    int capacity = 0;
    int top = -1;
    int stack[] = new int[capacity];
    String name;
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

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot perform pop operation.");
        } else {
            top--;
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
            System.out.println(name + " contains " + (top + 1) + " litres of water.");
            System.out.println("The " + name + " elements are as follows: ");
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

public class JugsOfWater {
    public static void main(String[] args) {
        Stacks jug1 = new Stacks(5, "jug1");
        Stacks jug2 = new Stacks(3, "jug2");

    }
}
