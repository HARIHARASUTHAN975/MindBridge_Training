import java.io.*;
import java.util.*;
class sum_of_arrays
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int[] array=new int[num];
        for(int i=0;i<num;i++)
        {
            array[i]=obj.nextInt();
        }
        int sum=0;
        for(int j=0;j<array.length;j++)
        {
            sum+=array[j];
        }
        System.out.println(sum);
    }
}