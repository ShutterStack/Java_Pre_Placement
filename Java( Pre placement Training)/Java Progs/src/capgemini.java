import java.util.Scanner;

public class capgemini {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println(" Enter the number of semesters: ");
        int n= sc.nextInt();
        int[]sem = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks in Subjects : "+ (i+1) + " semesters: ");
            int sub =sc.nextInt();
            sem[i]=sub;
    }
    for(int i=0;i<n;i++)
    {
        System.out.println("Marks obtained in " + (i+1) + " semester");
        int maximum =0,mark;
        while(sem[i]>0)
        {
            mark=sc.nextInt();
            if(!(mark<=100 && mark>=0))
            {
                System.out.println("You have entered invalid marks");
                return;
            }
            else{
                maximum=Math.max(maximum, mark);
                sem[i]--;
            }

        }
        System.out.printf("Maximum Marks in "+ (i+1) + "semester is: " + maximum);
    }
}
}


