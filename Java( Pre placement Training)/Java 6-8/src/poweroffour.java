import java.util.Scanner;

public class poweroffour {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter and integer n:");
        int n= sc.nextInt();
        boolean isPowerofFour = isPowerofFour(n);

        System.out.println(" Is "+n +" a power of four "+isPowerofFour);
    }
    private static boolean isPowerofFour(int n)
    {
        if(n<=0)
        {
            return false;
        }
        else{
            while(n>1)
            {
                if(n%4!=0)
                {
                    return false;
                }
                n/=4;
            }
        }
        return true;
    }
}
