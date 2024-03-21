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

    public void enqueue() {
        if (isFull()) {
            System.out.println("Queue is full, cannot perform enqueue operation.");
        } else {
            System.out.println("Enter the element to be inserted: ");
            int element = sc.nextInt();
            queue[++rear] = element;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot perform dequeue operation.");
        } else {
            int element = queue[front];
            System.out.println("The element to be deleted is: " + element);
            for (int i = 0; i < rear; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }
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

public class QueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int choice;
        while (true) {
            System.out.println("Enter the operation to be performed: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queue.enqueue();
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.traverse();
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