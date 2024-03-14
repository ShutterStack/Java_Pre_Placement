import java.util.*;
class calculatorapp {
    long factorial(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else{
            return (factorial(n-1)*n);
        }
    }
    double power(double base,double exponent)
    {
        return Math.pow(base, exponent);
    }

    
}

public class calculator 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculatorapp calculator=new calculatorapp();
        while(true)
        {
            System.out.println("1 : Factorial");
            System.out.println("2 : Power ");
            System.out.println("3: Exit");
            System.out.println("Enter ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                long factres = calculator.factorial(num);
                System.out.println("The factorial of the number is: "+factres);
                break;

                case 2:
                System.out.println("Enter Base and Exponent respectively: ");
                double b = sc.nextDouble();
                double e = sc.nextDouble();
                double powres = calculator.power(b,e);
                System.out.println("Resultant value of the power function is: "+powres);
                break;

                case 3:
                System.exit(0);
                default:
                System.out.println("Invalid Input!");
            }
        }
    }
}

    
