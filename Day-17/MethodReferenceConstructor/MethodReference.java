package MethodReferenceConstructor;
import java.util.*;
import java.util.Scanner;

public class MethodReference {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        StudentFactory studentfactorys=Student::new;
        List<Student> list=new ArrayList<>();
        System.out.print("Enter the Number of Students : ");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.print("Enter The "+i+" Student Name : ");
            String  name=obj.next();
            System.out.print("Enter The "+i+" Student Mark : ");
            int mark=obj.nextInt();
            list.add(studentfactorys.create(name,mark));
        }
        System.out.println("Created Sstudent objects are");
        list.forEach(str-> System.out.println(str));
    }
}
