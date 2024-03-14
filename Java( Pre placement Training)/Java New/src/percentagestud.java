import java.util.*;

public class percentagestud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double percentage[]= new double[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the percentage of student: "+(i+1));
            percentage[i] = sc.nextDouble();

        }
        //selection sort

        for(int i=0;i<percentage.length-1;i++)
        {
            int min =i;
            for(int j=i+1;j<percentage.length;j++)
            {
                if(percentage[j] > percentage[min])
                {
                    min = j;
                }
            }
            if(min!=i)
            {
                double temp = percentage[i];
                percentage[i]= percentage[min];
                percentage[min]=temp;
            }

        }

        //binary search
        double topper = percentage[0];
        double[] result ={70,60,90,88,155,96,76,72,81};
        if (result.length == 0) {
            System.out.println("Result array is empty.");
            return;
        }
        int index = binarySearch(result,topper);
        if(index>=0)
        {
            System.out.println("Topper percentage found at index: "+index);
        }
        else{
            System.out.println("Topepr percentage not found");
        }
        sc.close();
    }

    public static int binarySearch(double[] arr, double key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}