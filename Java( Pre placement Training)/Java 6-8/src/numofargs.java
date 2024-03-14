public class numofargs {
    void m1(int...n)
    {
        System.out.println("Ashish");
    }
    public static void main(String[] args) {
        numofargs obj = new numofargs();
        obj.m1();
        obj.m1(10);
        obj.m1(10,20);
        obj.m1(10,20,30);

    }
    
}
