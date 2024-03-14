import java.util.*;
class rats {
    public static int solve(int r,int unit,int [] arr,int n)
    {
        int count=0;
        int sum=0;
        if(arr==null)
        {
            return -1;
        }
        else
        {
            int res=r*unit;
            
            for(int i=0;i<n;i++)
            {
                sum+=arr[i];
                count++;
                if(sum>=res)
                {
                   break;
                    }
                }
                if(sum<res)
                {
                    return 0;
                }
            }
            return count;
            
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int unit =sc.nextInt();
            int n= sc.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                }
                System.out.println(solve(r, unit, arr, n));

        }
    }
