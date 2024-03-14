import java.util.Scanner;

public class accenture {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str = sc.next();
        System.out.println("Enter second string");
        String str1= sc.next();

        str = str.replaceAll("\\s", " ").toLowerCase();
        str1 = str1.replaceAll("\\s"," ").toLowerCase();

        if(str.length()!=str1.length())
        {
            System.out.println(str + " and " + str1 + "are not Anagram");
        }
        else
        {
            int freq []=new int[128];
            for(char ch:str.toCharArray())
            {
                freq[ch]++;

            }
            for(char ch:str1.toCharArray())
            {
                freq[ch]--;
            }
            boolean ana = true;
            for(int frequency : freq){
                if(frequency !=0){
                    ana=false;
                    break;
                }
            }

            if(ana)
            {
                System.out.println(str + " and "+ str1 + " are Anagram");
            }
            else{
                System.out.println(str + " and "+ str1 + " are not Anagram");
            }

        }
    }
}
