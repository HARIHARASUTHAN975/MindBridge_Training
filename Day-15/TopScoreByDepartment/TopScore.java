package TopScoreByDepartment;
import java.util.*;
public class TopScore {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        List<StudentsList> list=new ArrayList<>();
        System.out.print("Enter Number of Students: ");
        int num=obj.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.print("Enter Student Name : ");
            String name=obj.next();
            System.out.print("Enter GPA : ");
            double gpa=obj.nextDouble();
            System.out.print("Enter Department : ");
            String d=obj.next();
            list.add(new StudentsList(name,gpa,d));
        }
        Map<String,StudentsList> map=new HashMap<>();
        for(StudentsList s:list) {
            String dept = s.getDept();
            if (!map.containsKey(dept) || s.gpa > map.get(dept).gpa) {
                map.put(dept, s);
            }
        }
        map.forEach((dept,s)-> System.out.println("Top Scorer in "+dept+" Department is : "+s));
    }
}
