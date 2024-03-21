import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[100];

        System.out.println("Enter " + size + " number of elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index at which the element is to be deleted: ");
        int index = sc.nextInt();

        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}
