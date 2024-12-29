import java.io.*;
import java.util.*;
class count_of_ones
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int count=0;
        while(num!=0)
        {
            count+=num&1;
            num>>=1;
        }
        System.out.println(count);
        
    }
}