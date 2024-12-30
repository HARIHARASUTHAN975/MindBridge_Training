import java.io.*;
import java.util.*;
class Employee 
{
    public void calculateSalary() {
        System.out.println("Calculating salary for employee...");
    }
}
class Manager extends Employee 
{
    @Override
    public void calculateSalary() 
    {
        System.out.println("Salary of Manager Rs: 80,000/-");
    }
}
class Developer extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Salary of Developer Rs: 60,000/-");
    }
}
public class Employe
{
    public static void main(String[] args) 
    {
        Employee manager=new Manager();
        manager.calculateSalary();  
        Employee developer=new Developer();
        developer.calculateSalary();  
    }
}
