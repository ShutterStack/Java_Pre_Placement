import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int digitcount=0;

        while (num>0) {
            num/=10;
            digitcount++;
            
        }
        System.out.println("The Count number of digits are: "+ digitcount);

    }

}
