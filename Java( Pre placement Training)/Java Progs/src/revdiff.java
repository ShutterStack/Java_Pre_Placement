import java.util.Scanner;

public class revdiff {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter the difference: ");
        int diff = sc.nextInt();
        System.out.println("The reverse order with difference of" + diff + "is");
        for(int i=num;i>=0;i=i-diff)
        {
            System.out.println(i+" ");
        }
    }
}
