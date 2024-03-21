import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[100];

        System.out.println("Enter " + size + " number of elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }

        // Bubble sort.
        int temp = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter using bubble sort, the result is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}
