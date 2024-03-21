public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 17, 3, 9, 15, 1 };

        System.out.println("Array before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        // Logic.
        int minIndex = 0, temp = 0;

        // Selection sort.
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("\nAfter using selection sort, the result is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}