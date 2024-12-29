import java.io.*;
import java.util.*;
class Factorial_of_Number
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}