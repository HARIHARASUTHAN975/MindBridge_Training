package AverageGPA;
import java.util.*;
class Student
{
    String name;
    double gpa;
    public Student(String name,double gpa) {
        this.gpa = gpa;
        this.name = name;
    }
}
public class AverageGPACalculator {
        public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        List<Student> list=new ArrayList<>();
        System.out.print("Enter Numbers of Students : ");
        int num=obj.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.print("Enter Student Name : ");
            String name=obj.next();
            System.out.print("Enter GPA : ");
            double gpa=obj.nextDouble();
            list.add(new Student(name,gpa));
        }
        double avggpa=Average(list);
        System.out.println("Average GPA : "+avggpa);
    }
    public static double Average(List<Student> l)
    {
        final double[] result= {0};
        l.forEach(s-> result[0] +=s.gpa);
        return result[0] /l.size();
    }
}