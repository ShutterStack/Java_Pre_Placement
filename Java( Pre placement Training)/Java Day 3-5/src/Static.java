class Static
{
    {
        System.out.println("I am in non static block:");
    }
    static{
        System.out.println("I am in static block");
    }
    public static void main(String[] args) {
        Static s =new Static();
        System.out.println("I am in main");
    }

}