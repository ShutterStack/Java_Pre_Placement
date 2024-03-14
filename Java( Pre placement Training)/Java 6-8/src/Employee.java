public class Employee {
    protected int eno;
    protected String ename;
    protected double esal;
    protected String city;
    public Employee(int eno,String ename,double esal, String city)
    {
        this.eno=eno;
        this.ename = ename;
        this.esal = esal;
        this.city = city;
    }
    public void work()
    {
        System.out.println("Employee is working");
    }
    public double getSalary()
    {
        return esal;
    }
    public void addEmployee(int eno,String ename , double esal,String city)
    {

    }


    }

    class HRManager extends Employee{
        public HRManager(int eno,String ename,double esal,String city)
        {
            super(eno,ename,esal,city);
        }

        public void work()
        {
            System.out.println("Kapi HRManager");
        }
        public void showEmployee()
        {
            System.out.println("Employee Details are no. "+ eno + "Name: " + ename + "Salary: " + esal +"City: "+ city);
        }

        public static void main(String[] args) {
            Employee ob1 =new Employee(2, "Arya", 50000, "Thane");
            HRManager ob2 = new HRManager(3,"Bhaskar",60003,"Kalyan");
            ob1.work();
            ob2.work();
            ob2.showEmployee();

        }
    }

