import java.util.Scanner;

public class arrayrot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the number of steps to rotate the array: ");
        int steps = sc.nextInt();

        rotateArray(nums, steps);

        System.out.print("Rotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void rotateArray(int[] nums, int steps) {
        int length = nums.length;
        steps = steps % length; // Ensure steps is within the range of array length

        reverse(nums, 0, length - 1); // Reverse the entire array
        reverse(nums, 0, steps - 1); // Reverse the first part up to steps
        reverse(nums, steps, length - 1); // Reverse the rest of the array
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
