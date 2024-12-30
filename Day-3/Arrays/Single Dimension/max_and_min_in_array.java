import java.io.*;
import java.util.*;
class max_and_min_in_array
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=obj.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}