interface it1{
    double m1(int a,String str);
    int m1(char ch);
}
class inter2 implements it1{
    public double m1(int a,String str)
    {
        System.out.println("m1 2-arguments method");
        return 22.2;
    }
    public int m1(char ch)
    {
        System.out.println("m1 1-arguments method");
        return 40;
    }
    public static void main(String[] args) {
        inter2 obj = new inter2();
        int i=obj.m1('p');
        System.out.println("Value of i : "+i);
        double d=obj.m1(9,"Hello World");
        System.out.println("Value of d : "+d);
    }
    
}
