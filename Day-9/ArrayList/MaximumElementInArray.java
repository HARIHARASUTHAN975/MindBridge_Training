package ArrayList;
import java.util.*;
public class MaximumElementInArray {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        String[] str=obj.nextLine().split(" ");
        int num=str.length;
        for(int i=0;i<num;i++)
        {
            list.add(Integer.parseInt(str[i]));
        }
        Collections.sort(list);
        int max=list.get(num-1);
        System.out.println("Maximum Value is : "+max);
    }
}
