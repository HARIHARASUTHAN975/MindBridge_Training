import java.io.*;
import java.util.*;
class Person 
{
    private String name;
    private int age;
    public Person(String name, int age) 
    {
        this.name=name;
        this.age=age;
    }
    public void displayPersonDetails() 
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Student extends Person {
    private int rollNumber;
    private double marks;
    public Student(String name,int age,int rollNumber,double marks) {
        super(name,age);
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public void displayStudentDetails() 
    {
        displayPersonDetails();
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
    }
}
public class Persons{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=obj.nextLine();
        System.out.print("Enter age: ");
        int age=obj.nextInt();
        System.out.print("Enter roll number: ");
        int rollNumber=obj.nextInt();
        System.out.print("Enter marks: ");
        double marks=obj.nextDouble();
        Student student=new Student(name, age, rollNumber, marks);
        System.out.println("\nStudent Details:");
        student.displayStudentDetails();
    }
}