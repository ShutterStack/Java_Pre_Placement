import java.util.Scanner;

class QUEUE {
    final int size = 10;
    int arr[] = new int[size];
    int front = 0;
    int rear = -1;

    public boolean isFull() {
        if (rear >= size - 1) {
            return true;

        } else {
            return false;
        }

    }

    public boolean isEmpty() {
        if (rear == -1) {
            return true;

        } else {
            return false;
        }

    }

    public void insert(int data) {
        if (isFull()) {
            System.out.println("OVERFLOW");
        }

        else if (rear == -1) {
            arr[front] = data;
            rear = rear + 2;

        } else {

            arr[rear] = data;
            ++rear;

        }

    }

    public int delete() {

        if (isEmpty()) {
            System.out.println("underflow");
            return -1;

        } else {

            int data = arr[front];

            for (int i = 0; i <= rear - 1; i++) {
                arr[i] = arr[i + 1];

            }
            rear--;
            return data;

        }
    }

    public void peek() {

        if (isEmpty()) {
            System.out.println("underflow");

        }

        else {
            int data = arr[front];
            System.out.println("front is-->" + data);

        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("UNDERFLOW");
        } else {
            System.out.println("DISPLAY QUEEUE");
            for (int i = 0; i < rear; i++) {
                System.out.print(arr[i] + "-->");

            }
            System.out.println();
        }

    }

}

public class A4Sum {

    public static void main(String[] args) {
        QUEUE s = new QUEUE();

        s.insert(0);
        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(4);

        int noofsteps = 2;
        int size = 5;

        int noofshifts = size - noofsteps;

        QUEUE f = new QUEUE();
        for (int i = 0; i < noofshifts; i++) {
            int data1 = f.delete();
            f.insert(data1);

        }

        f.display();

    }
}