import java.util.*;

public class IntersectionBetweenArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] commonElements = new int[2];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] < arr2[j]) {
                j++;
            } else {
                commonElements[k++] = arr1[i];
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(commonElements));

    }
}