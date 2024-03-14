import java.util.*;
class InvalidUsernamePasswordException extends Exception {
    public InvalidUsernamePasswordException(String message)
    {
        super(message);

    }
}
public class exception3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
        String username = "admin";
        String password = "12345";
        System.out.println("Enter your username:");
        String user = sc.nextLine();
        System.out.println("Enter your password:");
        String pass = sc.nextLine();
        authenticateUser(username,password,user,pass);
        System.out.println("Authenticate Successfull");
        }
        catch(InvalidUsernamePasswordException e)
        {
            System.out.println("Authentication failed"+e.getMessage());
        }

    }
    private static void authenticateUser(String uName,String pWord,String username,String password) throws InvalidUsernamePasswordException
    {
        if(!uName.equals(username) || !pWord.equals(password)){
            throw new InvalidUsernamePasswordException("Invalid username or password");
        }

    }
}
