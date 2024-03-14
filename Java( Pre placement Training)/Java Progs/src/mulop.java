import java.util.Scanner;

public class mulop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter another num: ");
        int num1=sc.nextInt();
        

        if(num>0 && num1>0)
        {
            int result=0;
            for(int i=0;i<num1;i++)
            {
                result=result+num;
            }
            System.out.println("The product is: "+ result);

        }
        else{
            System.out.println("Enter positive num");
        }
    }
}
