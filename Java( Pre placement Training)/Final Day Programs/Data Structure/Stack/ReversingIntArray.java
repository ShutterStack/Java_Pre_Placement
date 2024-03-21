import java.util.Scanner;

class Stacks {
    int top = -1;
    int capacity = 100;
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
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i]);
            }
            System.out.println();
        }
    }
}

public class ReversingIntArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the array to be reversed: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Stacks stack = new Stacks();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        System.out.println("The reverse of the array is: ");
        stack.traverse();

    }
}
