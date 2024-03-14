import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("The Fibo series is :");
        int fir=0,sec=1;
        for(int i=0;i<num;i++)
        {
            System.out.println(fir+ " ");
            int next = fir+ sec;
            fir =sec;
            sec=next;
        }

    }
}
