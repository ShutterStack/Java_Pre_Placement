interface i1{
    default void m1(){
        System.out.println("i1 m1()method");
    }
}
interface i2{
    default void m2(){
        System.out.println("i2 m2() method");
        }
        }

class intern3 implements i1,i2{
    public void m1()
    {
        System.out.println("m1 mehtod common implementation");
    }
    public static void main(String []args){
        new intern3().m1();
    }
    
}
