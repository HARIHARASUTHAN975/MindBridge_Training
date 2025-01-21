package SortListOfStudents;
import java.util.*;
public class SortStudents {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        List<StudentsList> list=new ArrayList<>();
        System.out.print("Enter Numbers of Students:");
        int num=obj.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.print("Enter Student Name :");
            String name=obj.next();
            System.out.print("Enter GPA :");
            double gpa=obj.nextDouble();
            list.add(new StudentsList(name,gpa));
        }
        Collections.sort(list,(s1,s2)->Double.compare(s2.getGpa(),s1.getGpa()));
        System.out.println(list);
    }
}