import java.util.*;
public class Bikers_Altitude
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String[] input=obj.nextLine().split(" ");
        int[] gain=new int[input.length];
        for(int i=0;i< input.length;i++)
        {
            gain[i]=Integer.parseInt(input[i]);
        }
        int current=0;
        int max=0;
        for(int i=0;i<input.length;i++)
        {
            current+=gain[i];
            if(current>=max)
            {
                max=current;
            }
        }
        System.out.println(max);
    }
}
