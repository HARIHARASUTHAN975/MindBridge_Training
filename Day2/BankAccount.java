import java.io.*;
import java.util.*;
class BankAccount 
{
    private int accountNumber;
    private double balance;
    public BankAccount(int accountNumber,double balance) 
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount) 
    {
        if(amount>0) 
        {
            balance+=amount;
            System.out.println("Deposited: Rs: "+amount);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) 
    {
        if (amount>0&&amount<=balance) 
        {
            balance-=amount;
            System.out.println("Withdraw: Rs "+amount);
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount or insufficient Balance");
        }
    }
    public double getBalance() 
    {
        return balance;
    }
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Your Account Number: ");
        int accountNumber=obj.nextInt();
        System.out.print("Enter initial balance: ");
        double initialBalance=obj.nextDouble();
        BankAccount account=new BankAccount(accountNumber, initialBalance);
        System.out.print("Enter amount to deposit: ");
        double depositAmount=obj.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount=obj.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Final Balance: Rs: " + account.getBalance());
    }
}
