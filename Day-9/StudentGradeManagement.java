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
        int Max=Integer.MIN_VALUE;
        int Min=Integer.MAX_VALUE;
        double Avg=0;
        int Sum=0;
        for(int i=0;i<vector.size();i++)
        {
            Max=Math.max(vector.get(i),Max);
            Min=Math.min(vector.get(i),Min);
            Sum+=vector.get(i);
        }
        Avg=Sum/vector.size();
        System.out.println("Grades: "+vector);
        System.out.println("Highest Grade: "+Max);
        System.out.println("Lowest Grade: "+Min);
        System.out.println("Average Grade: "+Avg);
    }
}