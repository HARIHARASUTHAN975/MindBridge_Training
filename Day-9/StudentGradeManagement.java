import java.util.*;
public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String[] str=obj.nextLine().split(" ");
        int ind=obj.nextInt();
        Vector <Integer> vector=new Vector<>();
        for(int i=0;i<str.length;i++)
        {
            vector.add(Integer.parseInt(str[i]));
        }
        vector.remove(ind);
        int Maximum=Integer.MIN_VALUE;
        int Minimum=Integer.MAX_VALUE;
        double Average=0;
        int add=0;
        for(int i=0;i<vector.size();i++)
        {
            Maximum=Math.max(vector.get(i),Maximum);
            Minimum=Math.min(vector.get(i),Minimum);
            add+=vector.get(i);
        }
        Average=add/vector.size();
        System.out.println("Grades: "+vector);
        System.out.println("Highest Grade: "+Maximum);
        System.out.println("Lowest Grade: "+Minimum);
        System.out.println("Average Grade: "+Average);
    }
}
