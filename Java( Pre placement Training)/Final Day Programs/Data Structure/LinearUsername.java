import java.util.Scanner;

public class LinearUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usernames = {
                "user1",
                "user2",
                "user3",
                "user4",
                "user5",
                "user6",
                "user7",
                "user8",
                "user9",
                "user10"
        };

        // Array of passwords
        String[] passwords = {
                "pass123",
                "abc456",
                "qwerty",
                "secure1",
                "p@ssword",
                "hello123",
                "letmein",
                "changeme",
                "password",
                "login123"
        };

        System.out.println("Enter your username and password: ");
        String username = sc.nextLine();
        String password = sc.nextLine();
        boolean loginSuccessful = false;
        // int location = 0;

        for (int i = 0; i < 10; i++) {
            if (username.equals(usernames[i])) {
                if (password.equals(passwords[i])) {
                    loginSuccessful = true;
                    break;
                }
            }
        }

        if (loginSuccessful) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Unsuccessful!");
        }

        sc.close();
    }
}
