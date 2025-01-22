import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
class Students
{
    String name;
    int grade;
    public Students(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return  name+" : "+grade ;
    }
}
public class ModifyStudentGrades
    {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        System.out.print("Enter Numbers of Students : ");
        int n = obj.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Student " + i + " Name : ");
            String name = obj.next();
            System.out.print("Enter Student " + i + " Grade : ");
            int grade = obj.nextInt();
            list.add(new Student(name, grade));
        }
        Consumer<Student> c=(studentgrade)->{
            studentgrade.grade+=10;
            System.out.println(studentgrade);
        };
        list.forEach(c);
    }
    }
