class Data {
    int a;
    int b;
    Data()
    {
        this(10,20);
    }
    Data(int x,int y)
    {
        a=x;
        b=y;
        this.show();
    }
    void show()
    {
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    public static void main(String[] args) {
        Data ob = new Data(10,20);
        ob.show();
    }
}
