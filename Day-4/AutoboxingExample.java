import java.io.*;
import java.util.*;
public class AutoboxingExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(01);
        numbers.add(02);
        numbers.add(03);
        int sum=0;
        for (int i=0;i<numbers.size();i++)
        {
            sum+=numbers.get(i);
        }
        System.out.println("List of numbers: "+numbers);
        System.out.println("Sum of numbers: "+sum);
    }
}
