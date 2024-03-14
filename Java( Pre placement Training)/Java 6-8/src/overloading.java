class overloading {
    public void add(int a)
    {
        System.out.println(a+a);
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.add(1, 2, 5);
        obj.add(22,55);
        obj.add(5);
    }
    
}
