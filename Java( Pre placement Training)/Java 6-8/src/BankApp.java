import java.util.Scanner;

abstract class BankAccount{
    protected String accountname;
    protected double balance;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void inputCustData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder name: ");
        accountname=sc.nextLine();
    }
    public void showCustData(){
        System.out.println("Account Holder Name : "+accountname);
        System.out.println("Account Balance: "+balance);
    }

}
class SavingAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(double initialBalance,double interestRate) {
        this.balance=initialBalance;
        this.interestRate=interestRate;

    }
    public void deposit(double amount){
        balance+=amount +(amount*interestRate/100);
        System.out.println("deposit Successful");
    }
    public void withdraw(double amount)
    {
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdrawal Successfull");

        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

}

class CurrentAccount extends BankAccount{
    private double overdraftLimit;
    public CurrentAccount(double initialBalance,double overdraftLimit) {
        this.balance=initialBalance;
        this.overdraftLimit=overdraftLimit;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("deposit Successful");
    }
    public void withdraw(double amount)
    {
        if(balance-amount>=-overdraftLimit){
            balance-=amount;
            System.out.println("Withdrawal Successfull");

        }
        else{
            System.out.println("Exeds overdraft limit");
        }
    }

}
class BankApp {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(1000,5);
        s1.inputCustData();;
        s1.deposit(500);
        s1.showCustData();
        s1.withdraw(200);
        s1.showCustData();
        CurrentAccount c1 = new CurrentAccount(2000,1000);
        c1.inputCustData();
        c1.deposit(3000);
        c1.showCustData();
        c1.withdraw(4000);
        c1.showCustData();


    }
    
}

