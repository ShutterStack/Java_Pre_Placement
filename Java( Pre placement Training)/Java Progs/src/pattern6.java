public class pattern6 {
    public static void main(String[] args) {
        int counter=65;
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print((char)counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
