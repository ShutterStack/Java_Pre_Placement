import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }

        System.out.println(" The sorted array is :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
