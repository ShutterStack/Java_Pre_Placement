import java.util.Scanner;

class Stacks {
    final int capacity = 10;
    int top = -1;
    int stack[] = new int[capacity];
    Scanner sc = new Scanner(System.in);

    public boolean isFull() {
        return top >= (capacity - 1);
    }

    public boolean isEmpty() {
        return top == -1;
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
        }
        return element;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, no element to peek.");
        } else {
            int element = stack[top];
            System.out.println("The element at the top of the stack is: " + element);
        }
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Cannot traverse the stack, the stack is currently empty.");
        } else {
            System.out.println("The stack elements are as follows: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + "\t");
            }
            System.out.println();
        }
    }
}

public class StackSorting {
    public static void main(String[] args) {
        Stacks originalStack = new Stacks();
        Stacks tempStack = new Stacks();

        originalStack.push(34);
        originalStack.push(3);
        originalStack.push(31);
        originalStack.push(98);
        originalStack.push(92);
        originalStack.push(23);

        int element = 0;
        int temp = 0;

        System.out.println("Original Stack:");
        originalStack.traverse();
        System.out.println("Temp Stack:");
        tempStack.traverse();

        while (!originalStack.isEmpty()) {
            element = originalStack.pop();
            while (!tempStack.isEmpty() && element > tempStack.stack[tempStack.top]) {
                temp = tempStack.pop();
                originalStack.push(temp);
            }
            tempStack.push(element);

            System.out.println("\nOutput of this step is: ");
            System.out.println("Original Stack:");
            originalStack.traverse();
            System.out.println("Temp Stack:");
            tempStack.traverse();
        }

        System.out.println("\nFinal Sorted Stack:");
        tempStack.traverse();
    }
}
