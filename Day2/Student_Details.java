import java.io.*;
import java.util.*;
class Student_Details
{
    String name;
    int age;
    public Student_Details(String name, int age) 
    {
        this.name=name;
        this.age=age;
    }
    public void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String name=obj.nextLine();
        int age=obj.nextInt();
        Student_Details student=new Student_Details(name,age);
        student.displayDetails();
    }
}
