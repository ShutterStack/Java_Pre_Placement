interface i1{
    void m1();
    default void m2()
    {
        System.out.println("default method");
    }
    static void m3()
    {
        System.out.println("static method");
    }
}
class intern4 implements i1{
    public void m1(){System.out.print("Hello ");}
    public static void main(String []args){
        intern4 obj = new intern4();
        obj.m1();
        obj.m2();
        i1.m3();
    }
    
}
