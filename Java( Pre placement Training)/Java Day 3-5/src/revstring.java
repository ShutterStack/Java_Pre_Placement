import java.util.Scanner;

public class revstring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        
        char[] chararray=str.toCharArray();

        int start =0;
        int end =chararray.length-1;

        while(start<end)
        {
            //swap the characters
            char temp =chararray[start];
            chararray[start]=chararray[end];
            chararray[end] =temp;
            start++;
            end--;
        }
        System.out.println("Reversed string is:"+ new String(chararray));        
    }
}
