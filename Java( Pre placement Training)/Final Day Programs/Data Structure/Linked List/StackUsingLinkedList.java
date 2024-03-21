import java.util.Scanner;

public class StackUsingLinkedList {
    Scanner sc = new Scanner(System.in);

    class Node {
        int data;
        Node next;

        public Node() {
            next = null;
        }
    }

    Node head = null;
    Node top = null;

    public void push() {
        System.out.println("Enter the data to be inserted: ");
        int element = sc.nextInt();
        Node newNode = new Node();
        newNode.data = element;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else if (head == null) {
            head = newNode;
            top = newNode;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
            top = newNode;
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

    public void pop() {
        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
        top = ptr;
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

    public void peek() {
        System.out.println("The element at the top of the stack is: " + top.data);
    }

    public void deleteAtBegin() {
        head = head.next;
        System.out.println("Element deleted successfully.");
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
        StackUsingLinkedList stack = new StackUsingLinkedList();
        int choice;
        while (true) {
            System.out.println("Enter the operation to be performed: ");
            System.out.println("1. Push.");
            System.out.println("2. Pop.");
            System.out.println("3. Peek.");
            System.out.println("4. Traverse.");
            System.out.println("5. Exit.");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stack.push();
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.traverse();
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