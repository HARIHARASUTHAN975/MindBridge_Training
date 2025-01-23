package DisplayStudentDetails;
import MethodReferenceConstructor.Student;

import java.util.*;

public class StudentMethodReference {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        List<Students> list = new ArrayList<>();
        System.out.print("Enter Numberr of Students : ");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.print("Enter The "+i+" Student Name : ");
            String  name=obj.next();
            System.out.print("Enter The "+i+" Student Mark : ");
            int mark=obj.nextInt();
            list.add(new Students(name,mark));
        }
        System.out.println("Student objects Are : ");
        list.forEach(Students::displayStudentDetails);

    }
}
