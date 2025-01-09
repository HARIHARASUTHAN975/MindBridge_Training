import java.util.*;
public class TaskList
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        LinkedList <String> linkedlist=new java.util.LinkedList<String>();
        String str[]=obj.nextLine().split(",");
        for(int i=0;i<str.length;i++)
        {
            linkedlist.add(str[i]);
        }
        Iterator<String> iter1=linkedlist.iterator();
        while(iter1.hasNext())
        {
            System.out.println(iter1.next());
        }
        System.out.print("Enter the Task to Remove : ");
        String rem=obj.nextLine();
        int index=linkedlist.indexOf(rem);
        linkedlist.remove(index);
        System.out.println();
        System.out.println();
        System.out.println("Task List : ");
        Iterator<String> iter2=linkedlist.iterator();
        while(iter2.hasNext())
        {
            System.out.println(iter2.next());
        }
    }
}
