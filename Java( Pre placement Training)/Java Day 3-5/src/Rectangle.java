

class RectangleArea{
    private double length;
    private double breadth;
    public RectangleArea(double length,double breadth)
    {
        this.length=length;
        this.breadth=length;

    }
    public double area(){
        return length * breadth;
    }
    
}

public class Rectangle{
    public static void main(String[] args) {
        RectangleArea ob1=new RectangleArea(4, 5);
        RectangleArea ob2 = new RectangleArea(5, 8);
        System.out.println("The Area of Rectangle is "+ ob1.area());
        System.out.println("The Area of Rectangle is : "+ ob2.area());
    }


}
