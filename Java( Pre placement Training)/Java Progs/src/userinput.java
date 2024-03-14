import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array:");
        n =sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+n+" numbers : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
