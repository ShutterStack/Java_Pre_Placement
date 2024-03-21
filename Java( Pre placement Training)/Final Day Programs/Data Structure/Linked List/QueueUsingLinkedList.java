import java.util.Scanner;

public class QueueUsingLinkedList {
    Scanner sc = new Scanner(System.in);

    class Node {
        int data;
        Node next;

        public Node() {
            next = null;
        }
    }

    Node head = null;

    public void enqueue() {
        System.out.println("Enter the data to be inserted: ");
        int element = sc.nextInt();
        Node newNode = new Node();
        newNode.data = element;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else if (head == null) {
            head = newNode;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    public void addAtBegin() {
        System.out.println("Enter the data to be inserted: ");
        int element = sc.nextInt();
        Node newNode = new Node();
        newNode.data = element;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAfter() {
        System.out.println("Enter the data to be inserted: ");
        int element = sc.nextInt();

        System.out.println("Enter the element after which the new node is to be inserted: ");
        int afterThis = sc.nextInt();

        Node newNode = new Node();
        newNode.data = element;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else {
            Node ptr = head;
            while (ptr.data != afterThis) {
                ptr = ptr.next;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;

        }
    }

    public void deleteAtEnd() {
        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
        System.out.println("Last element deleted successfully.");
    }

    public void deleteAfter() {
        System.out.println("Enter the element after which the node is to be deleted: ");
        int afterThis = sc.nextInt();

        Node ptr = head;
        while (ptr.data != afterThis) {
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        System.out.println("Element deleted successfully.");
    }

    public void dequeue() {
        head = head.next;
        System.out.println("Element deleted successfully.");
    }

    public void peek() {
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        System.out.println("The data at the end of the queue is: " + ptr.data);
    }

    public void traverse() {
        Node ptr = head;
        System.out.println("The linked list is as follows: ");
        while (ptr != null) {
            System.out.print(ptr.data + "-->");
            ptr = ptr.next;
        }
        System.out.print("X");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        int choice;
        while (true) {
            System.out.println("Enter the operation to be performed: ");
            System.out.println("1. Enqueue.");
            System.out.println("2. Dequeue.");
            System.out.println("3. Peek.");
            System.out.println("4. Traverse.");
            System.out.println("5. Exit.");

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
    }
}