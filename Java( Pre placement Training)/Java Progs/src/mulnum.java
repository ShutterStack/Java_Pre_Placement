import java.util.Scanner;

public class mulnum {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int mul=1;
        while(num>0)
        {
            mul*=num %10;
            num/=10;
        }
        System.out.println("The multiplication of digits are: "+ mul);
    }
}
