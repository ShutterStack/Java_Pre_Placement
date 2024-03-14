import java.util.Scanner;

public class dist {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str = sc.next();
        System.out.println("Enter the second string");
        String str1= sc.next();
        int j=0;

        int len = str.length();
        if(str.length()==str1.length())
        {
            for(int i=0;i<=len-1;i++)
            {
                if (str.charAt(i)!=str1.charAt(i)) 
                {
                    j++;
                }
            }
            System.out.println("No of operations required: "+j);
        }
        else if (str.length()>=str1.length()) 
        {
            System.out.println("String length is difference");
            System.out.println("The difference is:"+ (str.length()-str1.length()));
            
        }
        else if(str.length()<=str1.length())
        {
            System.out.println("String length is difference");
            System.out.println(" The difference is: "+(str1.length()-str.length()));
        }

    }
}
