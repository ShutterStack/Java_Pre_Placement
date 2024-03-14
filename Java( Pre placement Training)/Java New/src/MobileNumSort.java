import java.util.Scanner;

public class MobileNumSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mobileNumbers = new String[10];
        System.out.println("Enter 10 mobile numbers of 10 digits each:");
        for (int i = 0; i < 10; i++) {
            mobileNumbers[i] = sc.next();
        }

        for(int i=0; i<9; i++) {
            System.out.println("Pass " + (i+1) + ":");
            for(int j=0; j<9-i; j++) {
                if(mobileNumbers[j].compareTo(mobileNumbers[j+1]) > 0) {
                    String temp = mobileNumbers[j];
                    mobileNumbers[j] = mobileNumbers[j+1];
                    mobileNumbers[j+1] = temp;
                }
                for(int k=0; k<10; k++) {
                    System.out.println(mobileNumbers[k] + " ");
                }
                System.out.println();
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i >= 3 && i <= 6) {
                mobileNumbers[i] = mobileNumbers[i] + " Hello";
            } else {
                mobileNumbers[i] = mobileNumbers[i] + " hi";
            }
        }
        System.out.println("Sorted and concatenated mobile numbers:");
        for (String number : mobileNumbers) {
            System.out.println(number);
        }
        sc.close();
    }
}