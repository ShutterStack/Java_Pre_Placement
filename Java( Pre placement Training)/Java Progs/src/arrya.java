import java.util.Arrays;

public class arrya {
    public static void main(String[] args) {
        int []arr={23,42,52,35,69,55,99,83,28,19};
        int indexPosition =2;
        int newValue=5;
        System.out.println("Original arrya:"+Arrays.toString((arr)));
        for(int i=arr.length-1;i>indexPosition;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[indexPosition]=newValue;
        System.out.println("New arrya"+ Arrays.toString(arr));
    }
}
