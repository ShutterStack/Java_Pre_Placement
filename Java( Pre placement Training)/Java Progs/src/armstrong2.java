public class armstrong2 {
    public static void main(String[] args) {
        System.out.println("The armstrong number betwenn 1 t0 5000 is: ");

        for(int num=1;num<=5000;num++)
        {
            int orgnum =num;
            int result=0;
            int n=0;
            while(orgnum!=0){
            orgnum/=10;
            ++n;}

            orgnum=num;
            while(orgnum!=0)
            {
                int remainder =orgnum%10;
                result+=Math.pow(remainder,n);
                orgnum/=10;
            }
            if(result==num){
                System.out.println(num+" ");
            }
        }
      
    }
}
