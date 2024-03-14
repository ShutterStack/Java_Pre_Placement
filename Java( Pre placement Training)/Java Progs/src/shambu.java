import java.util.Scanner;

public class shambu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int [] digits = new int[4];

        for(int i=0;i<4;i++)
        {
            digits[i]=sc.nextInt();
            char ch =(char)digits[i];
            System.out.print(digits[i] + " - " + ch + " ");
        }
    }
}
