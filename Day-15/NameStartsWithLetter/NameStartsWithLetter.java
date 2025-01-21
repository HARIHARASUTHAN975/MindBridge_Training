package NameStartsWithLetter;
import java.util.*;
class Student
{
    String name;
    double gpa;
    public Student(String name,double gpa) {
        this.gpa = gpa;
        this.name = name;
    }
    @Override
    public String toString() {
        return name+" : "+gpa;
    }
}
public class NameStartsWithLetter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        List<Student> list1 = new ArrayList<>();
        System.out.print("Enter Numbers of Students : ");
        int num = obj.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter Student Name : ");
            String name = obj.next();
            System.out.print("Enter GPA :");
            double gpa = obj.nextDouble();
            list1.add(new Student(name, gpa));
        }
        System.out.print("Enter the Starting letter : ");
        String s1=obj.next();
        List<Student> list2 = new ArrayList<>();
        list1.forEach(s ->{
            if(s.name.charAt(0)==s1.charAt(0)){
                list2.add(s);
            }
        } );
        System.out.println("Students Name Starts with "+s1.charAt(0)+" Letter : ");
        list2.forEach(System.out::println);
    }
}