import java.util.Scanner;

public class fanny {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the character u want to remove: ");
        char c=sc.next().charAt(0);  
        int n=str.length();
        for (int i = 0; i < n -1 ; i++)
        if (str.charAt(i) == c) {
            str = str.substring(0, i) + str.substring(i+1);
            i--;
            n--;
            }
            System.out.print("The new string is : "+str+"\n");
            }
            }

