import java.util.Arrays;

public class stockspan {
    public static void main(String[] args) {
        int [] price = {100,80,60,70,60,75,85};
        int n=price.length;
        int [] s=new int[n];

        s[0]=1;

        for(int i=0;i<n;i++)
        {
            s[i]=1;
        
        for(int j=i-1;(j>=0) && (price[i])>=price[j];j--)
        {
            s[i]++;
        }
        
    }
    System.out.println(Arrays.toString(s));
}
}
