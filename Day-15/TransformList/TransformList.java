package TransformList;
import java.util.*;
public class TransformList {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        List<String> list1=new ArrayList<>();
        System.out.print("Enter Numbers of Students: ");
        int num=obj.nextInt();
        for(int i=0;i<num;i++) {
            System.out.print("Enter Student "+(i+1)+" : ");
            list1.add(obj.next());
        }
        List<String> list2=new ArrayList<>();
        for (String s:list1)
        {
            list2.add("Student: "+s.toUpperCase());
        }
        list2.forEach(System.out::println);
    }
}
