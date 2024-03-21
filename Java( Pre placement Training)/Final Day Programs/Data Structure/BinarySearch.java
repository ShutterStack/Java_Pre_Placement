import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter the element to be searched: ");
        int element = sc.nextInt();
        int pos = 0;
        boolean flag = false;

        int mid = 0, low = 0, high = size - 1;
        while (high >= low) {
            // mid = low + (high - low) / 2;
            mid = (low + high) / 2;

            if (arr[mid] == element) {
                flag = true;
                pos = mid;
                break;
            } else if (arr[mid] > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
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
