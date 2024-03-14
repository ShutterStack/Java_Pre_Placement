import javax.crypto.AEADBadTagException;

class A{
    public void showA(){
        System.out.println("This is Class A");
    }
}
class B extends A{
    public void showB(){
        System.out.println("This is Class B");
    }
}
class C extends B{
    public void showC()
    {
        System.out.println("This is Class C");
    }
}
class simpleinheri
{
    public static void main(String[] args) {
        B obj1=new B();
        obj1.showA();
        obj1.showB();
        C obj2=new C();
        obj2.showA();
        obj2.showB();
        obj2.showC();

    }
}