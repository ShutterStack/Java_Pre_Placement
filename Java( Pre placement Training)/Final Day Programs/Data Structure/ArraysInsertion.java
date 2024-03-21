import java.util.*;

public class ArraysInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[100];

        System.out.println("Enter " + size + " number of elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index at which the element is to be inserted: ");
        int index = sc.nextInt();

        System.out.println("Enter the element to be inserted: ");
        int element = sc.nextInt();

        int i = 0;
        for (i = size - 1; i > index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = arr[i];
        arr[i] = element;
        size++;

        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}