import java.io.*;
import java.util.*;
class Account 
{
    int accountNumber;
    double balance;
    public Account(int accountNumber) 
    {
        this.accountNumber=accountNumber;
        this.balance=0.0; 
    }
    public Account(int accountNumber, double balance) 
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayDetails() 
    {
        System.out.println("Account Number: " +accountNumber);
        System.out.println("Balance: " +balance);
    }
    public static void main(String[] args) 
    {
        Account acc1 = new Account(12345);
        Account acc2 = new Account(67890, 500.0);
        acc1.displayDetails();
        acc2.displayDetails();
    }
}
