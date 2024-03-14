import java.util.Scanner;

class Bank {
    protected int c_accno;
    protected String c_name;
    protected String c_city;
    protected double balance;
    public void inputData()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter acc number: ");
        c_accno = sc.nextInt();
        System.out.println("Enter name: ");
        c_name= sc.next();
        System.out.println("Enter City: ");
        c_city=sc.next();
        System.out.println("Enter Initial Balance");
        balance = sc.nextDouble();

    }
    public void display()
    {
        System.out.println("Account Number : "+c_accno);
        System.out.println("City : " + c_city);
        System.out.println("Name is: "+ c_name);
        System.out.println("Balance is: "+balance);
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println(" Amount Deposited! New balance is :"+balance);

    }
    public void withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Withdrawn amount! New balance is :"+ balance);

        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    
}
class SavingsAccount extends Bank{
    public void withdraw(double amount)
    {
        if(balance-amount>=1000)
        {
            balance=balance-amount;
            System.out.println("Withdrawn amount! New balance is: "+ balance);
        }
        else
        {
            System.out.println(" Jayada paise dal tharo account not exeecds 1000");
        }
    }
}

public class BankAccount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount ob1 =new SavingsAccount();
        while(true)
        {
            System.out.println(" Welcome to Apun ka bank");
            System.out.println("1: Input Data");
            System.out.println("2: Display data");
            System.out.println("3: Deposit money ");
            System.out.println("4: Withdraw money ");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                ob1.inputData();
                    
                    break;
                    case 2:
                    ob1.display();
                    break;
                    case 3:
                    System.out.println("Enter deposit amount: ");
                    double amt=sc.nextDouble();
                    ob1.deposit(amt);
                    break;
                    case 4:
                    System.out.println("Enter withdrawn amount: ");
                    double wd=sc.nextDouble();
                    ob1.withdraw(wd);
                    break;
                    case 5:
                    System.exit(0);
                    default : System.out.println("Invalid Choice");
            }

        }
    }
}
