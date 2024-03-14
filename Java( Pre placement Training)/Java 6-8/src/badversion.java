import java.util.Scanner;

class badversion {
    public static boolean badVersion(int a,int b){
        if(a<b)
        {
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total version");
        int v1= sc.nextInt();
        System.out.println("Enter first bad version: ");
        int b1=sc.nextInt();

        for(int i=0;i<=v1;i++)
        {
            System.out.println(""+i+" is "+badVersion(i, b1));
        }
    }
}
