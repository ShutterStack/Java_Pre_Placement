import java.util.Scanner;

public class LLRotation {
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

    public void addAtBegin(int element) {
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

    public int deleteAtEnd() {
        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        int element = ptr.next.data;
        ptr.next = null;
        // System.out.println("Last element deleted successfully.");
        return element;
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
        LLRotation queue = new LLRotation();

        System.out.println("Enter the number of elements to be inserted into the queue: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            queue.enqueue();
        }
        System.out.println("The current state of the queue is as follows: ");
        queue.traverse();

        System.out.println("Enter the amuont of shifts to be performed: ");
        int shift = sc.nextInt();

        int element;
        for (int i = 0; i < shift; i++) {
            element = queue.deleteAtEnd();
            queue.addAtBegin(element);
        }

        System.out.println();
        queue.traverse();
    }
}