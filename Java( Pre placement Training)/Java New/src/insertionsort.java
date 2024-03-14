import java.util.*;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp =0;
        int arr[] = new int[100];
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements to be inserted ");
        for (int i=0;i<n;i++) 
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++) {
            System.out.println("Pass " + (i+1) + ":");
            for(int j=0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                for(int k=0; k<n; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

        System.out.println( "The sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}