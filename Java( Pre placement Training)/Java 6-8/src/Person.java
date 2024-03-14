class Test{
    void message(){
        System.out.println(" I am person class");
    }
}
class Student extends Test{
    void message(){
        System.out.println(" I am student class");
    }
    void display()
    {
        message();
        super.message();
    }
}
class Person
{
    public static void main(String[] args){
        Student st = new Student();
        st.display();
    }

}
