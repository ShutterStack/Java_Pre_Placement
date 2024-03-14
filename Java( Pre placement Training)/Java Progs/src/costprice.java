import java.util.Scanner;

public class costprice {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Are you a student");
        String stu = sc.next();
        System.out.println("Enter Cost Price: ");
        double cp= sc.nextDouble();
        double discount;

        if(stu.equalsIgnoreCase("yes"))
        {
            if(cp>500)
            {
               discount =  0.10 * cp;


            }
            else
            {
                discount= 0.05 *cp;
            }
        }
        else{
            if(cp>500)
            {
                discount = 0.08*cp;
            }
            else{
                discount = 0.02*cp;
            }
        }
        double net = cp-discount;
        System.out.println(" The net price is:" + net);
        System.out.println(" The discounted Price is :" + discount);
    }
}
