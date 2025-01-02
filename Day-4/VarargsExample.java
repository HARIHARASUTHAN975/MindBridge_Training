import java.io.*;
public class VarargsExample
{
    public static int sum(int... numbers)
    {
        int total=0;
        for (int number:numbers)
        {
            total+=number;
        }
        return total;
    }
    public static void main(String[] args)
    {
        System.out.println("Sum of 1,2,3: "+sum( 1,2,3));
        System.out.println("Sum of 10,20,30,40,50: "+sum(10,20,30,40,50));
        System.out.println("Sum of no arguments: "+sum());
        System.out.println("Sum of a single number (42): "+sum(42));
    }
}