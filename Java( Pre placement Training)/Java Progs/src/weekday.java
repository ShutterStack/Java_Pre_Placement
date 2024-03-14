import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input Day");
        String day = sc.next();

        if(day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday"))
        {
            System.out.println("Weekend");
        }
        else{
            System.out.println("Working day");
        }
    }
}
