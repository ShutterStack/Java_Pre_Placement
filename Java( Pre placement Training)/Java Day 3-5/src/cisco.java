import java.util.Arrays;
import java.util.Scanner;

public class cisco {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int [] array = new int[n];

        System.out.println("Distinct integer: ");
        for(int i =0; i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        int missing = 1;
        for(int i=0;i<n-1;i++)
        {
            if(array[i]!=missing)
            {
                break;
            }
            missing++;
        }
        System.out.println("The Missing element is: "+missing);
    }
}
