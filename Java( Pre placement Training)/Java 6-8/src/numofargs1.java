public class numofargs1 {
    void m1(char ch,int...a){
        System.out.println("Char is : "+ch);
        for (int i: a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        numofargs1 n = new numofargs1();
        n.m1('A');
        n.m1('B',10);
        n.m1('C',10,20);
        n.m1('D', 10,20,30,40);
    }
}
