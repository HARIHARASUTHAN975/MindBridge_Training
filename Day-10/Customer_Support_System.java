import java.util.*;
import java.util.LinkedList;

public class Customer_Support_System
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        Queue <String> queue=new LinkedList<>();
        String [] str=obj.nextLine().split(" ");
        for(int i=0;i<str.length;i++)
        {
            queue.add(str[i]);
        }
        String Service=queue.poll();
        System.out.println("Service: "+Service);
        System.out.println("Waiting: "+queue);
    }
}
