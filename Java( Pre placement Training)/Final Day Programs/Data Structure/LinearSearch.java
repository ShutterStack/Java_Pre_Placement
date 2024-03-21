import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[100];
        System.out.println("Enter the " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int element = sc.nextInt();
        int pos = 0;
        boolean flag = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                flag = true;
                pos = i;
            }
        }

        if (flag) {
            System.out.println("Element found at index " + pos);
        } else {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}
