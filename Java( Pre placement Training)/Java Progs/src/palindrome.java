import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int orgnum,revnum=0,remainder;
        orgnum=num;
        while(num!=0)
        {
            remainder=num%10;
            revnum = revnum*10+remainder;
            num/=10;
        }
        if(revnum==orgnum)
        {
            System.out.println(orgnum + " is Palindrome");
        }
        else{
            System.out.println(orgnum + " Not a palindrome");
        }
    }
}
