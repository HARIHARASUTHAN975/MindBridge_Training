import java.io.*;
import java.util.*;
class pyramid_pattern
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=num;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}