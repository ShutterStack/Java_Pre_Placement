//time complexity n/2 or log (n)

import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println( "Enter elements of the array in sorted order : "); 
        for (int i=0 ;i<n ; i++)  
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number to search in the array");
        key = sc.nextInt();
        int low = 0;
        int high = n-1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at position: " + (mid+1));
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (low > high) {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}