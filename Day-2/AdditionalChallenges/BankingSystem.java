import java.io.*;
import java.util.*;
class BankAccount 
{
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    public BankAccount(String accountHolderName, int accountNumber, double initialDeposit) 
    {
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=initialDeposit;
    }
    public void deposit(double amount) 
    {
        if(amount>0) 
        {
            balance+=amount;
            System.out.println("Deposited Rs: "+amount);
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
            System.out.println("Withdrawn Rs: "+amount);
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public void checkBalance() 
    {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Banking System!");
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        BankAccount account = new BankAccount(name, accountNumber, initialDeposit);
        while (true) 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the Banking System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}