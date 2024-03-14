interface ABC{
    public void show();
}
class pqr
{
    static int i=20;
}
class inter1 extends pqr implements ABC{
    public void show(){
        System.out.println("I am in abc");
    }

    public static void main(String[] args) {
        ABC a;
        inter1 z=new inter1();
        a=z;
        a.show();
        System.out.println(i);
    }
}


