import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter marks of 3 papers: ");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c =sc.nextInt();
  
        System.out.println("Enter Gender");
        String gen = sc.next();
        int sum = a+b+c;
        double percentage = (double) (sum/3);
        System.out.println(sum);

        System.out.println(percentage);
        if(gen.equalsIgnoreCase("female")&& percentage>=62)
        {
            System.out.println("Admission granted");
        }
        else{
            System.out.println("Denied");
        }


        

       /* 
       if (a<45 && b<45 && c<45)
        {
            System.out.println("Fail");
        }
        else{
            System.out.println("pass");
        }*/ 
    }
}
