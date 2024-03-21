import java.util.*;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // Create an empty array list with an initial capacity.
        ArrayList<String> colorList = new ArrayList<>(4);
        // Use add() method to add values in the list.
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("White");
        // print out the colors in the array list.
        System.out.println("***Color list***");
        for (int i = 0; i < 4; i++) {
            System.out.println(colorList.get(i).toString());
        }
        // Create an empty array sample with an initial capacity.
        ArrayList<String> sample = new ArrayList<>(3);
        // Use add() method to add values in the list.
        sample.add("Yellow");
        sample.add("Red");
        sample.add("White");
        // now add sample with colorList.
        colorList.addAll(sample);
        // new size of the list.
        System.out.println("New size of the list is: " + colorList.size());
        // print out the colors.
        System.out.println("***Color List***");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(colorList.get(i).toString());
        }
    }
}