import java.util.Scanner;

class Queue {
    final int capacity = 10;
    int queue[] = new int[capacity];
    int front = 0;
    int rear = -1;

    Scanner sc = new Scanner(System.in);

    public boolean isFull() {
        if (rear >= (capacity - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (front == 0 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full, cannot perform enqueue operation.");
        } else {

            queue[++rear] = element;
        }
    }

    public int dequeue() {
        int element = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot perform dequeue operation.");
        } else {
            element = queue[front];
            // System.out.println("The element to be deleted is: " + element);
            for (int i = 0; i < rear; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }
        return element;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot perform peek operation.");
        } else {
            int element = queue[rear];
            System.out.println("The element at the rear of the queue is: " + element);
        }
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Cannot traverse the queue, the queue is currently empty.");
        } else {
            System.out.println("The queue elements are as follows: ");
            System.out.print(" | ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " | ");
            }
            System.out.println();
        }
    }
}

public class ArrayRotation {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.traverse();

        int noOfSteps = 2;
        int noOfShifts = 5 - noOfSteps;
        int removedElement = 0;

        for (int i = 0; i < noOfShifts; i++) {
            removedElement = queue.dequeue();
            queue.enqueue(removedElement);
        }

        queue.traverse();
    }
}
