import java.util.Scanner;

public class series2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextInt();
        System.out.println("enter a range: ");
        int ran = sc.nextInt();

        double sum =1.0;
        double term = 1.0;
        for(int i=1;i<=ran;i++)
        {
            term =term*(num/i);
            sum = sum+term;
        }
        System.out.println("the sum of series is: "+ sum);
    }
}
