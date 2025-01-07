import java.io.*;
import java.util.*;
class Skip_Multiply_of_five
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        for(int i=1;i<100;i++)
        {
            if(i%5==0)
                continue;
            System.out.println(i);
        }
    }
}