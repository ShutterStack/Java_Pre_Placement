import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int orgnum,remainder,result=0,n=0;
        orgnum=num;
        while(orgnum!=0){
            orgnum/=10;
            ++n;
        }
        orgnum=num;

        while(orgnum!=0)
        {
            remainder=orgnum%10;
            result+=Math.pow(remainder, n);
            orgnum/=10;

        }
        if(result==num)
        {
            System.out.println("Armstrong Number: "+num);
        }
        else{
            System.out.println("Not an armstrong");
        }

    }
}
