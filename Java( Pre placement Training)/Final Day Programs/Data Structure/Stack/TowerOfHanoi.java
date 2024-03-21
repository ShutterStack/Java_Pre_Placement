import java.util.Scanner;

class Stacks {
    final int capacity = 3;
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

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot perform pop operation.");
        } else {
            stack[top] = 0;
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

public class TowerOfHanoi {
    public static void traverseAll(Stacks A, Stacks B, Stacks C) {
        for (int i = 0; i < 3; i++) {
            System.out.println(A.stack[i] + "\t" + B.stack[i] + "\t" + C.stack[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Stacks A = new Stacks();
        Stacks B = new Stacks();
        Stacks C = new Stacks();
        A.push(1);
        A.push(2);
        A.push(3);
        System.out.println("Step 1: The Initial condition is as follows: ");
        traverseAll(A, B, C);

        System.out.println("Step 2: Moving 1 from A to C.");
        A.pop();
        C.push(1);
        traverseAll(A, B, C);

        System.out.println("Step 3: Moving 2 from A to B.");
        A.pop();
        B.push(2);
        traverseAll(A, B, C);

        System.out.println("Step 4: Moving 1 from C to B.");
        C.pop();
        B.push(1);
        traverseAll(A, B, C);

        System.out.println("Step 5: Moving 3 from A to C");
        A.pop();
        C.push(3);
        traverseAll(A, B, C);

        System.out.println("Step 6: Moving 1 from B to A.");
        B.pop();
        A.push(1);
        traverseAll(A, B, C);

        System.out.println("Step 7: Moving 2 from B to C.");
        B.pop();
        C.push(2);
        traverseAll(A, B, C);

        System.out.println("Step 8: Moving 1 from A to C.");
        A.pop();
        C.push(1);
        traverseAll(A, B, C);

    }
}
