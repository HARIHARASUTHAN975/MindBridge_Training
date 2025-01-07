package ArrayList;
import java.util.*;
public class ReverseArrayList {
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
        System.out.println("original List : "+list);
        Collections.reverse(list);
        System.out.println("Reversed List : "+list);
    }
}
