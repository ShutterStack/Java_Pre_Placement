import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int fact=1;

        if(num<0)
        {
            System.out.println("No Factorial");

        }
        else
        {
            while(num>0)
            {
                fact*=num;
                num--;
            }
            System.out.println("the factorial of"+ num +" is "+fact);
        }
    }
}
