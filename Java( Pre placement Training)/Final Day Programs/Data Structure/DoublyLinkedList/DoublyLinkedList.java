import java.util.Scanner;

public class DoublyLinkedList {
    Scanner sc = new Scanner(System.in);

    class Node {
        int data;
        Node prev;
        Node next;

        public Node() {
            prev = null;
            next = null;
        }
    }

    Node head = null;

    public void append() {
        System.out.println("Enter the data to be inserted: ");
        int element = sc.nextInt();
        Node newNode = new Node();
        newNode.data = element;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else if (head == null) {
            head = newNode;
            head.prev = null;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
            newNode.prev = ptr;
        }
    }

    public void addAtBegin() {
        System.out.println("Enter the data to be inserted: ");
        int element = sc.nextInt();
        Node newNode = new Node();
        newNode.prev = null;
        newNode.data = element;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else {
            newNode.next = head;
            head.prev = newNode;
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
        newNode.prev = null;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else {
            Node ptr = head;
            while (ptr.data != afterThis) {
                ptr = ptr.next;
            }
            newNode.next = ptr.next;
            ptr.next.prev = newNode;
            ptr.next = newNode;
            newNode.prev = ptr;
            // ptr.next = newNode;

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
        ptr.next.next.prev = ptr;
        System.out.println("Element deleted successfully.");
    }

    public void deleteAtBegin() {
        head = head.next;
        head.prev = null;
        System.out.println("Element deleted successfully.");
    }

    public void traverse() {
        Node ptr = head;
        System.out.println("The linked list is as follows: ");
        while (ptr != null) {
            System.out.print(ptr.data + "<-->");
            ptr = ptr.next;
        }
        System.out.print("X");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList ll = new DoublyLinkedList();
        int choice;
        while (true) {
            System.out.println("Enter the operation to be performed: ");
            System.out.println("1. Append.");
            System.out.println("2. Add at begin.");
            System.out.println("3. Add at after.");
            System.out.println("4. Delete at end.");
            System.out.println("5. Delete at after.");
            System.out.println("6. Delete at begin.");
            System.out.println("7. Traverse");
            System.out.println("8. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ll.append();
                    break;

                case 2:
                    ll.addAtBegin();
                    break;

                case 3:
                    ll.addAfter();
                    break;

                case 4:
                    ll.deleteAtEnd();
                    break;

                case 5:
                    ll.deleteAfter();
                    break;

                case 6:
                    ll.deleteAtBegin();
                    break;

                case 7:
                    ll.traverse();
                    break;

                case 8:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}