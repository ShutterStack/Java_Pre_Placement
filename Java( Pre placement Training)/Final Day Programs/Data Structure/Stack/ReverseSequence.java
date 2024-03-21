
// import java.util.Arrays;
import java.util.Scanner;

class Stacks {
    int top = -1;
    int capacity = 100;
    char stack[] = new char[capacity];
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

    public void push(char element) {
        if (isFull()) {
            System.out.println("Stack is full, cannot perform push operation.");
        } else {
            stack[++top] = element;
        }
    }

    public char pop() {
        char element = '0';
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot perform pop operation.");
        } else {
            element = stack[top];
            top--;
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
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i]);
            }
            System.out.println();
        }
    }
}

public class ReverseSequence {
    public static void main(String[] args) {
        System.out.println("Enter the string to be reversed: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder outputString = new StringBuilder("");

        char charArray[];
        Stacks stack = new Stacks();

        String[] newStr = str.split(" ");
        for (String string : newStr) {
            charArray = string.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                stack.push(charArray[i]);
            }
            while (!stack.isEmpty()) {
                outputString.append(stack.pop());
            }
            outputString.append(" ");
        }
        System.out.println("The reverse of the string is: ");
        System.out.println(outputString);
    }
}