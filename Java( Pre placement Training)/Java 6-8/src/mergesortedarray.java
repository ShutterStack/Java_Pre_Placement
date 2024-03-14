public class mergesortedarray {
    public static void merge(int []num1,int m,int []num2,int n)
    {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0)
        {
            if(num1[i]>num2[j])
            {
                num1[k]=num1[i];
                i--;
            }
            else{
                num1[k]=num2[j];
                j--;
            }
            k--;
        }
        while(j>=0)
        {
            num1[k]=num2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int []num1={1,2,3,0,0,0};
        int m=3;
        int []num2={2,5,6};
        int n=3;

        merge(num1, m, num2, n);
        for(int i=0;i<num1.length;i++){
            int num =num1[i];
            System.out.print(num+" ");
            }
            }
            }