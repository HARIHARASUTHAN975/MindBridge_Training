package This_Keyword;
import java.io.*;
import java.util.*;
class Employee 
{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id=id; 
        this.name=name;
        this.salary=salary;
    }

    public void displayDetails() {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary Rs: "+salary);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int id=obj.nextInt();
        obj.nextLine();
        String name=obj.nextLine();
        double salary=obj.nextDouble();
        Employee emp=new Employee(id,name,salary);
        emp.displayDetails();
    }
}