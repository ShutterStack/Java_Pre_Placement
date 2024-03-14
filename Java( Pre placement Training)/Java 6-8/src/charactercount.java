import java.util.Scanner;

public class charactercount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str =sc.nextLine();
        int i,j,count;
        for(i=0;i<str.length();i++)
        {
            count=0;
            for(j=0;j<=i;j++)
            {
                if( str.charAt(i)==str.charAt(j))
                {
                    count++;

                }
            }
            if(count==1)
            {
                System.out.println(str.charAt(i));  
            }
        }
        for(i=0;i<str.length();i++)
        {
            count=0;
            for(j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;

                }
            }
            if(count==1)
            {
                System.out.println(str.charAt(i));
            }
            else
            {
                System.out.println(str.charAt(i)+count);
            }

        }
    }
}
