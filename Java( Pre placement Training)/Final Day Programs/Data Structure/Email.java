import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 email id's: ");
        String[] emails = new String[5];
        for (int i = 0; i < 5; i++) {
            sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            if (emails[i].startsWith("raj")) {
                System.out.println(emails[i] + " starts with raj.");
            } else {
                System.out.println(emails[i] + " doesn't start with raj.");
            }
        }
        sc.close();
    }
}
