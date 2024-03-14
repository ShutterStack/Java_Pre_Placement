import java.util.*;
public class maxnum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int max=0;
        if(a>b && a>c && a>d && a> e)
        {
            max=a;
        }
        if(b>a && b>c && b>d && b>e)
        {
            max=b;
        }
        if(c>a && c>b && c>d && c>e)
        {
            max=c;
        }
        if(d>a && d>c && d>b && d>e)
        {
            max=d;
        }
        if(e>a && e>c && e>d && e>b)
        {
            max=e;
        }
        System.out.println("The largest number is :"+ max);


    }
}
