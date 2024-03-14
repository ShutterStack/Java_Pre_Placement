import java.util.Scanner;

public class centuryleap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year= sc.nextInt();

        if(year%100 !=0){
            if(year%4==0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a leap year");
            }

        }
        else{
            if (year %400==0) {
                System.out.println("Century leap year");
                
            }
            else{
                System.out.println("Not a century leap year");
            }
        }
    }
}
