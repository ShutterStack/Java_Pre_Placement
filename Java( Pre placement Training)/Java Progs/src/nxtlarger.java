import java.util.Arrays;

public class nxtlarger {
    public static void main(String[] args) {
        int [] array={4,2,10,7,8,9};
        System.out.println("Original Array:"+Arrays.toString(array));
        int []result= new int[array.length];

        for(int i=0;i<array.length;i++)
        {
            int next = -1;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]>array[i])
                {
                    next = array[j];
                    break;
                }
            }
            result[i]=next;
        }
        System.out.println("The next largest is: "+ Arrays.toString(result));
    }
}
