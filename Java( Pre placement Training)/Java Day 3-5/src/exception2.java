import java.util.*;
public class exception2 extends Exception {
    public exception2()
    {
        System.out.println("not eligible try after some time");
    }
}
class UserException
{
    static void status(int age) throws exception2
    {
        if(age>18){
            System.out.println("Eligible for marry");
        }
        else{
            throw new exception2();
        }
    }

    public static void main(String[] args) throws exception2 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        UserException.status(age);
        sc.close();
    }
    
}
