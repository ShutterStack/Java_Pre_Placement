import java.util.*;
public class unique {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array:");
        int n = sc.nextInt();
        System.out.println("Enter of elements you want in array : ");
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean found = false;
       

        for(int j = 0; j<arr.length;j++){
            for(int k = 0; k<arr.length; k++){
                if(arr[j]==arr[k]){
                    if(j!=k){
                        found = true;
                        break;
                    }


                }


            }
        }

        System.out.println(found);
    }
}


