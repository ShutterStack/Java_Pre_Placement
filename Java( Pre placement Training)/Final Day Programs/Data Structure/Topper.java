import java.util.Arrays;
import java.util.Scanner;

public class Topper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] percentages = new int[10];
        System.out.println("Enter 10 percentages: ");
        for (int i = 0; i < 10; i++) {
            percentages[i] = sc.nextInt();
        }

        int minIndex = 0, temp = 0;
        for (int i = 0; i < percentages.length; i++) {
            minIndex = i;
            for (int j = i; j < percentages.length; j++) {
                if (percentages[minIndex] > percentages[j]) {
                    minIndex = j;
                }
            }
            temp = percentages[i];
            percentages[i] = percentages[minIndex];
            percentages[minIndex] = temp;
        }

        int topperPercentage = percentages[percentages.length - 1];
        System.out.println("Topper percentage is: " + topperPercentage);
        int result[] = { 70, 60, 90, 80, 155, 96, 76, 72, 81 };
        Arrays.sort(result);
        System.out.println("Sorted result array is as follows: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
        System.out.println();

        int pos = 0;
        boolean flag = false;

        int mid = 0, low = 0, high = result.length - 1;
        while (high >= low) {
            // mid = low + (high - low) / 2;
            mid = (low + high) / 2;

            if (result[mid] == topperPercentage) {
                flag = true;
                pos = mid;
                break;
            } else if (result[mid] > topperPercentage) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (flag) {
            System.out.println("Topper Marks found at index " + pos);
        } else {
            System.out.println("Topper marks not found.");
        }
        sc.close();
    }
}
