public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 17, 3, 9, 15, 1 };
        int loc, temp;

        System.out.println("Array before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            loc = i - 1;

            while (loc >= 0 && arr[loc] > temp) {
                arr[loc + 1] = arr[loc];
                loc--;
            }
            arr[loc + 1] = temp;
        }
        System.out.println("\nAfter using insertion sort, the result is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
