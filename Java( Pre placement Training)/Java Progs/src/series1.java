import java.util.Scanner;

public class series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();
        System.out.println("Enter range: ");
        int ran = sc.nextInt();
        double sum =0.0;

        for(int i=1;i<=ran;i++)
        {
            sum=sum+(Math.pow(num,i)/i);
            System.out.println("The sum of series is : "+ sum);
        }
        
    }
}
