import java.util.*;

public class emailid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] emailId = new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter emailid's: "+(i+1));
            emailId[i] = sc.next();

        }

        for(int i=0;i<emailId.length;i++)
        {
            String email = emailId[i];
            if(email.toLowerCase().startsWith("raj"))
            {
                System.out.println(email + " is of Raj.");
            }
        }
        sc.close();
    }
    
}
