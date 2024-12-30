import java.io.*;
import java.util.*;
class Counter 
{
    private static int count=0;
    public Counter() 
    {
        count++;
    }    
    public static int getCount() 
    {
        return count;
    }
}
public class counters{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number of Counter objects to create: ");
        int numberOfObjects=obj.nextInt();
        for(int i=0;i<numberOfObjects;i++) 
        {
            new Counter();
        }
        System.out.println("Number of objects created: "+Counter.getCount());
    }
}
