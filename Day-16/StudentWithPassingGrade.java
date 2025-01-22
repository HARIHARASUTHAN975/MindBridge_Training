import java.util.*;
import java.util.function.Predicate;

class Student
{
    String name;
    int grade;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return  name +" : "+grade;
    }
}
public class StudentWithPassingGrade {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        System.out.print("Enter Numbers of Students : ");
        int n = obj.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print("Enter Student "+i+" Name : ");
            String name = obj.next();
            System.out.print("Enter Student "+i+" Grade : ");
            int grade = obj.nextInt();
            list.add(new Student(name, grade));
        }
        checkStudentGrade(list, m -> m.grade > 60);
    }

    public static void checkStudentGrade(List<Student> list, Predicate<Student> p) {
        System.out.println("Students With Pass Grades are :");
        list.forEach(i -> {
            if (p.test(i))
                System.out.print(i.name+" ");
        });
    }
}