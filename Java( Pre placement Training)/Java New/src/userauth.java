import java.util.*;
public class userauth {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String [] username = new String[10];
        String [] password = new String[10];

        for(int i=0;i<10;i++)
        {
            System.out.println("Enter Username: "+(i+1));
            username[i] = sc.nextLine();
            System.out.println( "Enter Password: "+(i+1));
            password[i] = sc.nextLine();

        }
        System.out.println("Enter Username to search: ");
        String name = sc.nextLine();
        System.out.println("Enter password to be search: ");
        String pass = sc.nextLine();

        boolean login = false;
        for(int i=0;i<10;i++)
        {
            if(username[i].equalsIgnoreCase(name) && password[i].equalsIgnoreCase(pass))
            {
                login = true;
                break;
            }

        }
        if(login)
        {
            System.out.println("Login Successful! ");

        }
        else{
            System.out.println("Error");
        }
        sc.close();

    }
}
