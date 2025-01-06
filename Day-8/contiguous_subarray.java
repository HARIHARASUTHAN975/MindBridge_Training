import java.util.*;
public class contiguous_subarray {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String [] str=obj.nextLine().split(" ");
        int[] array=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            array[i]=Integer.parseInt(str[i]);
        }
        int currentsum=array[0];
        int max=array[0];
        for(int i=1;i< str.length;i++)
        {
            currentsum=Math.max(array[i],currentsum+array[i]);
            max=Math.max(max,currentsum);
        }
        System.out.println(max);
    }
}
